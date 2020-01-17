/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leonov_2019_2020;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Predicate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gines
 */
public class TipusMissatges {
	
	static String bd = "baseDeDades/Leonov_2019_2020.db4o";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	
	
    
    //1. Carregar en memòria el fitxer de TipusMissatges
    LinkedList<TipusMissatges_Dades> menu1(LinkedList<TipusMissatges_Dades> tipusMissatgesLLista) throws IOException {
        File fitxer = new File("arxiusPerCarregar/TipusMissatges.txt");     // Adreçament relatiu.
        FileReader fr = null;                     // Entrada.
        BufferedReader br;                        // Buffer.

        String liniaLLegida;
        String comanda[];
        int id = 0;
        String nom = "";
        String dataTmpString;
        LocalDateTime dataCreacio = null;
        LocalDateTime dataAnulacio = null;
        boolean actiu = true;
            

        try {  
            fr = new FileReader (fitxer);          // Inicialitza entrada del fitxer
            br = new BufferedReader(fr);           // Inicialitza buffer amb l’entrada
            
            while((liniaLLegida = br.readLine())!= null) {
                comanda = liniaLLegida.split("=");
                
                switch (comanda[0]) {
                    case "id":
                        id = Integer.parseInt(comanda[1]);
                        break;
                    case "nom":
                        nom = comanda[1];
                        break;
                    case "actiu":
                        actiu = Boolean.parseBoolean(comanda[1]);
                        //System.out.println("comanda[1] = " + comanda[1] + "; actiu = " + actiu);
                        break;                        
                    case "dataCreacio":
                    	dataTmpString = "";
                    	dataCreacio = null;
                    	if (comanda.length == 2) {
                        	dataTmpString = comanda[1];
                            //System.out.println("dataTmpString(comanda[1]) = " + dataTmpString);
                            
                            if (!dataTmpString.contains(":")) {
                            	dataTmpString = dataTmpString + " 00:00";
                            }
                            
                            dataCreacio  = LocalDateTime.parse(dataTmpString, formatter);                    		
                    	}

                        break;
                    case "dataAnulacio":
                    	dataTmpString = "";
                    	dataAnulacio = null;
                        actiu = true;
                        if (comanda.length == 2) {
                        	dataTmpString = comanda[1];
                        	//System.out.println("dataTmpString (dataAnulacio) = " + dataTmpString);
                        	
                            if ((dataTmpString.length() != 0) & (!dataTmpString.contains(":"))) {
                            	dataTmpString = dataTmpString + " 00:00";
                            }
                        	
                            dataAnulacio  = LocalDateTime.parse(dataTmpString, formatter);
                            
                            if (dataAnulacio.isBefore(LocalDateTime.now())){
                                actiu = false;
                            }
                        } else {
                        	//System.out.println("No hi ha data anulació");
                        	//Guardarà un null en l'atribut dataAnulacio.
                        }
                        
                        tipusMissatgesLLista.add(new TipusMissatges_Dades(id, nom, actiu, dataCreacio, dataAnulacio));
                        
                        break;
                    default:
                        System.out.println("COMANDA EN FITXER SUBTIPUS NO RECONEGUDA");                    
                }
            }
            
            /*
            //PER A MOSTRAR LA LLISTA A VEURE SI HEM CARREGAT BE LES DADES.
            System.out.println();
            int i = 0;
            Iterator<TipusMissatges_Dades> iterador = tipusMissatgesLLista.iterator();
            while (iterador.hasNext()) {
                System.out.println("tipusMissatgesLLista[" + i + "]:" + iterador.next());   
                i++;
            }
            */

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TipusMissatges.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TipusMissatges.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fr != null) fr.close();
            System.out.println("menu1(): FINAL");
        }
        
        return tipusMissatgesLLista;
    }
    
    
    //2. Carregar en la BD els tipus de missatges carregats en memòria.
    void menu2(LinkedList<TipusMissatges_Dades> tipusMissatgesLLista){
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        //config.common().objectClass(Calendar.class).callConstructor(true);
        //S'ha de fer una configuració especial perquè db4o pugui treballar amb Calendar.
        ObjectContainer db = Db4oEmbedded.openFile(config, bd);  
        
        
        try {
            for (TipusMissatges_Dades dadaTmp: tipusMissatgesLLista) {
                //Comprobem si a la BD hi ha algun tipus de missatge com el que volem insertar.
                
                int tipusMissatgeId = dadaTmp.getId();
                
                Predicate p = new Predicate<TipusMissatges_Dades>() { 
                    @Override 
                    public boolean match(TipusMissatges_Dades c) { 
                        return c.getId() == tipusMissatgeId;
                    } 
                }; 
            
                ObjectSet<TipusMissatges_Dades> result = db.query(p);       //En result tenim els objectes que s'han trobat en la BD que compleixen la condició de filtratge (la query).
                
                if (!result.isEmpty()) {
                    //Hem trobat en la BD un tipus de missatge amb el mateix ID. L'anem a updatejar.
                    
                    TipusMissatges_Dades tipusMissatgeTmp = result.next();  //tipusMissatgeTmp apunta al mateix objecte que el trobat en la BD.
                    System.out.println("menu2(): UPDATE, tipusMissatgeId = " + tipusMissatgeId + ", tipusMissatgeTmp.nom = " + tipusMissatgeTmp.getNom());
                    tipusMissatgeTmp.setNom(dadaTmp.getNom());
                    tipusMissatgeTmp.setActiu(dadaTmp.isActiu());
                    tipusMissatgeTmp.setDataCreacio(dadaTmp.getDataCreacio());
                    tipusMissatgeTmp.setDataAnulacio(dadaTmp.getDataAnulacio());
                    
                    db.store(tipusMissatgeTmp);
                    
                } else{
                    //No hem trobat en la BD un tipus de missatge amb el mateix ID. L'insertem.
                    db.store(dadaTmp);
                    System.out.println("menu2(): INSERT");
                }
            }
        } finally {
            db.close();     //Fem el bloc try-finally per asegurar-nos el tancament de la DB.
            System.out.println("menu2(): FINAL");
        }
    }
    
    
    //3.LListar els tipus de missatges.
    void menu3() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        //config.common().objectClass(Calendar.class).callConstructor(true);
        ObjectContainer db = Db4oEmbedded.openFile(config, bd); 

        try { 
            Predicate p = new Predicate<TipusMissatges_Dades>() { 
                @Override 
                public boolean match(TipusMissatges_Dades c) { 
                    return true; 
                } 
            }; 
            
            List<TipusMissatges_Dades> result = db.query(p); 
            
            for (TipusMissatges_Dades dadaTmp : result) { 
                System.out.println(dadaTmp); 
            } 
            
            /*UNA ALTRA FORMA:
            ObjectSet<TipusMissatges_Dades> result = db.query(p); 
            
            Iterator<TipusMissatges_Dades> iterador = result.iterator();
            while (iterador.hasNext()) {
                System.out.println("Tipus de missatge:" + iterador.next());   
            }*/
            
        } finally { 
            db.close(); 
            System.out.println("menu3(): FINAL");
        }         
    }
    
    
        
    
}
