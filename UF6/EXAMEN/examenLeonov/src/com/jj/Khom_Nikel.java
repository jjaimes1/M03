/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gmartinez
 */
public class Khom_Nikel {
    /*
    5. Sistema d'identificació Khom-Nikel
    */
    
        public static void bloquejarPantalla() {
        Scanner in = new Scanner(System.in);
        System.out.print("Toca 'C' per a continuar ");
        while (in.hasNext()) {
            if ("C".equalsIgnoreCase(in.next())) break;
        }
    }
    
    
    public static void menuKhom_Nikel() throws IOException  {
        String opcio;
        Scanner sc = new Scanner(System.in);
        StringBuilder menu = new StringBuilder("");
        
        Khom_Nikel_ObjecteMenu objMenuTmp = new Khom_Nikel_ObjecteMenu();
        
        do {
            menu.delete(0, menu.length());
            
            menu.append(System.getProperty("line.separator"));
            menu.append("SRZO-1 Khrom-Nikel ");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            
            menu.append("1. Carregar en memòria els objectius i els tipus d'objectius");
            menu.append(System.getProperty("line.separator"));
            menu.append("2. Carregar en la BD els objectius i els tipus d'objectius carregats en memòria");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            
            menu.append("10. LListar els objectius");
            menu.append(System.getProperty("line.separator"));
            menu.append("11. LListar els tipus d'objectius");
            menu.append(System.getProperty("line.separator"));
            menu.append("12. LListar els tipus d'objectius ordenats");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            
            menu.append("21. LListar els objectius d'un tipus concret");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            
            menu.append("50. Tornar al menú pare (PNS-24 Puma)");
            menu.append(System.getProperty("line.separator"));
            
            System.out.print(MenuConstructorPantalla.constructorPantalla(menu));
            
            opcio = sc.next();
            
            switch (opcio) {
                case "1":
                    objMenuTmp = Objectiu.menu1(objMenuTmp);
                    bloquejarPantalla();
                    break;
                case "2":

                    Objectiu.menu2carragaBDObiTipusOb(objMenuTmp);
                    bloquejarPantalla();
                    break;
                case "10":
                    Objectiu.menu10llistarObjectius();
                    bloquejarPantalla();
                    break;
                case "11":
                    Objectiu.menu11llistarTipusObjectius();
                    bloquejarPantalla();
                    break;
                case "12":
                    Objectiu.menu12llistarTipusObjectiusOrdenat();
                    bloquejarPantalla();
                    break;
                case "21":
                    Objectiu.menu21llistarObjectiusConcret();
                    bloquejarPantalla();
                    break;                    
                case "50":
                    break; 
                default:
                    System.out.println("COMANDA NO RECONEGUDA");
            }   
        } while (!opcio.equals("50"));
    }
    
}
