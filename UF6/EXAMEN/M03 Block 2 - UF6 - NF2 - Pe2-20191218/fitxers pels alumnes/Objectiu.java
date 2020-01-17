/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_2019_2020_DAM;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Predicate;
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
    
    
    
    
    
    
    
}
