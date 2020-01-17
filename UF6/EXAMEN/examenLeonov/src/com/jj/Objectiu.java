/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jj;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Predicate;
import javafx.beans.binding.ObjectBinding;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gmartinez
 */
public class Objectiu {
    private static String nomBD = "baseDeDades/Leonov_2019_2020_DAM.db4o";

    public static int valor = 0;
 
    //1. Carregar en memòria els objectius i els tipus d'objectius.
    public static Khom_Nikel_ObjecteMenu menu1(Khom_Nikel_ObjecteMenu objMenuTmp){
        int[] coordenadesTmp = null;
        LocalDate dataActual;     
        ArrayList<Objectiu_Dades> llistaObjectius = new ArrayList<Objectiu_Dades>();
        ArrayList<ObjectiuTipus_Dades> llistaObjectiusTipus = new ArrayList<ObjectiuTipus_Dades>();
        
        
        dataActual = LocalDate.now();

        llistaObjectiusTipus.add(new ObjectiuTipus_Dades(0, "Asteroide", dataActual));
        llistaObjectiusTipus.add(new ObjectiuTipus_Dades(1, "Punt Lagrange", dataActual.minusYears(1)));
        llistaObjectiusTipus.add(new ObjectiuTipus_Dades(2, "LLuna", dataActual.minusYears(3)));
        llistaObjectiusTipus.add(new ObjectiuTipus_Dades(3, "Planeta", dataActual.minusYears(2)));
        
        
        coordenadesTmp = new int[] {0,0,0};
        llistaObjectius.add(new Objectiu_Dades(0, "Terra", coordenadesTmp, llistaObjectiusTipus.get(3), true, dataActual, null, dataActual));
        
        coordenadesTmp = new int[] {1,1,0};
        llistaObjectius.add(new Objectiu_Dades(1, "Terra-LLuna", coordenadesTmp, llistaObjectiusTipus.get(1), true, dataActual, null, dataActual));
        
        coordenadesTmp = new int[] {2,2,0};
        llistaObjectius.add(new Objectiu_Dades(2, "LLuna", coordenadesTmp, llistaObjectiusTipus.get(2), true, dataActual, null, dataActual));
        
        coordenadesTmp = new int[] {10,10,5};
        llistaObjectius.add(new Objectiu_Dades(3, "Mart", coordenadesTmp, llistaObjectiusTipus.get(3), true, dataActual, null, dataActual));
        
        coordenadesTmp = new int[] {100,20,10};
        llistaObjectius.add(new Objectiu_Dades(4, "Júpiter", coordenadesTmp, llistaObjectiusTipus.get(3), true, dataActual, null, dataActual));
        
        coordenadesTmp = new int[] {101,21,10};
        llistaObjectius.add(new Objectiu_Dades(5, "Júpiter-Europa", coordenadesTmp, llistaObjectiusTipus.get(1), true, dataActual, null, dataActual));
        
        coordenadesTmp = new int[] {101,21,10};
        llistaObjectius.add(new Objectiu_Dades(6, "Europa", coordenadesTmp, llistaObjectiusTipus.get(2), true, dataActual, null, dataActual));
        
        coordenadesTmp = new int[] {10,10,5};
        llistaObjectius.add(new Objectiu_Dades(7, "Venus", coordenadesTmp, llistaObjectiusTipus.get(3), true, dataActual, null, dataActual));
        
        objMenuTmp.llistaObjectius = llistaObjectius;
        objMenuTmp.llistaObjectiusTipus = llistaObjectiusTipus;
        
        System.out.println("menu1(): FINAL");



        return objMenuTmp;
    }

    public static void menu2carragaBDObiTipusOb(Khom_Nikel_ObjecteMenu obj)
    {
        ObjectContainer db = Db4oEmbedded.openFile(nomBD);
        //ficar els objectius i els tipus d'objectius del menu 1 en la BD

        for (int i = 0; i < obj.llistaObjectius.size(); i++)
        {
         db.store(obj.llistaObjectius.get(i));
        }
        db.close();

    }

    public static void menu10llistarObjectius()
    {
        ObjectContainer db = Db4oEmbedded.openFile(nomBD);

        Predicate predicate = new Predicate<Objectiu_Dades>() {
            @Override
            public boolean match(Objectiu_Dades o) {
                return valor <=o.getId();
            }
        };
        ObjectSet<Objectiu_Dades> res = db.query(predicate);
        System.out.println("OBJECTIUS:");

        String inexistent="NO EXISTEIX";
        while (res.hasNext())
        {
            Objectiu_Dades obDad = res.next();

                System.out.println("OBJECTIU " + obDad.getId() +
                        "\n\tnom =\t" + obDad.getNom() +
                        "\n\tcooredenades(x,y,z) =\t(" + obDad.getCoordenades()[0] + "," + obDad.getCoordenades()[1] + "," + obDad.getCoordenades()[2] + ")" +
                        "\n\tTIPUS D'OBJECTIU " + obDad.getTipus().getId() + ":\t" + obDad.getTipus().getNom() + " creat " + obDad.getTipus().getDataCreacio() +
                        "\n\tactiu =\t" + obDad.isActiu() +
                        "\n\tdataCreacio =\t" + obDad.getDataCreacio());
                if (obDad.getDataAnulacio() == null) {
                    System.out.println("\tdataAnulacio =\t" + inexistent);
                } else {
                    System.out.println("\tdataAnulacio =\t" + obDad.getDataAnulacio());
                }
                System.out.println("\tdataModificacio =\t" + obDad.getDataModificacio());
        }
    }
    public static void menu11llistarTipusObjectius()
    {
        ObjectContainer db = Db4oEmbedded.openFile(nomBD);

        Predicate predicate = new Predicate<ObjectiuTipus_Dades>() {
            @Override
            public boolean match(ObjectiuTipus_Dades o) {
                return valor <=o.getId();
            }
        };
        ObjectSet<ObjectiuTipus_Dades> res = db.query(predicate);
        System.out.println("TIPUS D'OBJECTIUS:");

        for (int i = 0; i < 4; i++)
        {
            ObjectiuTipus_Dades obTipus = res.next();
            System.out.println("\tTIPUS D'OBJECTIU "+obTipus.getId() +":\t"+ obTipus.getNom() + " creat el " + obTipus.getDataCreacio());
        }
    }

    public static void menu12llistarTipusObjectiusOrdenat()
    {
        //// TODO: 12/18/19 inacabado
        int opcio;
        Scanner sc = new Scanner(System.in);
        System.out.println("TIPUS D'OBJECTIUS ORDENATS EN FUNCIO DE:");
        System.out.println("1. En funcio del ID");
        System.out.println("2. Alfabeticament");
        System.out.println("3. Per data de creacio (descendent)");
        System.out.print("Escollir un tipus d'ordenacio [1-3]: ");
        opcio= Integer.parseInt(sc.nextLine());
        switch (opcio)
        {
            case 1:


                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("opcio equivocada");
        }


        ObjectContainer db = Db4oEmbedded.openFile(nomBD);

        Predicate predicate = new Predicate<ObjectiuTipus_Dades>() {
            @Override
            public boolean match(ObjectiuTipus_Dades o) {
                return valor <=o.getId();
            }
        };
        ObjectSet<ObjectiuTipus_Dades> res = db.query(predicate);
        System.out.println("TIPUS D'OBJECTIUS ORDENATS:");

        ObjectiuTipus_Dades obTipus2=res.next();

        List<ObjectiuTipus_Dades> listaNova = new ArrayList<ObjectiuTipus_Dades>();

        for (int i = 0; i < 4; i++)
        {
            ObjectiuTipus_Dades obTipus = res.next();

            listaNova.add(obTipus);
            System.out.println("\tTIPUS D'OBJECTIU "+obTipus.getId() +":\t"+ obTipus.getNom() + " creat el " + obTipus.getDataCreacio());
        }
        System.out.println(listaNova);

    }
    public static void menu21llistarObjectiusConcret()
    {
        //// TODO: 12/18/19 inacabado

        boolean sortirBucle = false;
        int opcio;
        Scanner sc = new Scanner(System.in);
        System.out.println("TIPUS D'OBJECTIUS:");
        System.out.println("0. Asteroide " +
                "\n1. Lluna" +
                "\n2.Planeta" +
                "\n3. Punt Lagrange");

        while (sortirBucle=false) {
            System.out.println("SELECCIONAR UN TIPUS D'OBJECTIU [0 - 4]: ");
            opcio = Integer.parseInt(sc.nextLine());
            switch (opcio) {
                case 0:
                    sortirBucle=true;
                    break;
                case 1:
                    sortirBucle=true;
                    break;
                case 2:
                    sortirBucle=true;
                    break;
                case 3:
                    sortirBucle=true;
                    break;
            }
        }


        ObjectContainer db = Db4oEmbedded.openFile(nomBD);

        Predicate predicate = new Predicate<Objectiu_Dades>() {
            @Override
            public boolean match(Objectiu_Dades o) {
                return valor <=o.getId();
            }
        };
        ObjectSet<Objectiu_Dades> res = db.query(predicate);
        System.out.println("OBJECTIUS:");

        String inexistent="NO EXISTEIX";
        while (res.hasNext())
        {
            Objectiu_Dades obDad = res.next();

            System.out.println("OBJECTIU " + obDad.getId() +
                    "\n\tnom =\t" + obDad.getNom() +
                    "\n\tcooredenades(x,y,z) =\t(" + obDad.getCoordenades()[0] + "," + obDad.getCoordenades()[1] + "," + obDad.getCoordenades()[2] + ")" +
                    "\n\tTIPUS D'OBJECTIU " + obDad.getTipus().getId() + ":\t" + obDad.getTipus().getNom() + " creat " + obDad.getTipus().getDataCreacio() +
                    "\n\tactiu =\t" + obDad.isActiu() +
                    "\n\tdataCreacio =\t" + obDad.getDataCreacio());
            if (obDad.getDataAnulacio() == null) {
                System.out.println("\tdataAnulacio =\t" + inexistent);
            } else {
                System.out.println("\tdataAnulacio =\t" + obDad.getDataAnulacio());
            }
            System.out.println("\tdataModificacio =\t" + obDad.getDataModificacio());
        }
    }




}
