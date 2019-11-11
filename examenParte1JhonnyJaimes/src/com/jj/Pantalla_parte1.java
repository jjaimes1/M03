package com.jj;

import java.util.Scanner;

public class Pantalla_parte1 {
	public static void bloquejarPantalla() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Toca 'C' per a continuar ");
        while (in.hasNext()) {
            if ("C".equalsIgnoreCase(in.next())) break;
        }
        System.out.println();
        System.out.println();
    }
    

    public static void main(String[] args) {
        String opcio;
        Boolean exitEnLaOperacio = false;
        
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---------------- ORBITA 10 ----------------");
            System.out.println("1. Inicialitzar dades");
            System.out.println("2. Veure totes les naus");
            System.out.println();
            System.out.println("11. Insertar una nova nau");
            System.out.println();
            System.out.println("21. Visualitzar el nº de naus versus el seu tipus");
            System.out.println("22. Visualitzar les naus versus un tipus");
            System.out.println();
            System.out.println();
            System.out.println("50. Tancar el programa");
            System.out.println();
            System.out.print("opció?: ");
            opcio = sc.next();

            switch (opcio) {
                case "1":
                    Naus.menu_1();
                    bloquejarPantalla();
                    break;
                case "2":

                    Naus.menu_2();
                    bloquejarPantalla();
                    break;
                case "11":

                    Naus.menu_11();
                    bloquejarPantalla();
                    break;
                case "21":

                    Naus.numNausVsTipus();
                    bloquejarPantalla();
                    break;
                case "22":

                    bloquejarPantalla();
                    break;           
                case "50":
                    break; 
                default:
                    System.out.println("ERROR: COMANDA NO RECONEGUDA");
                    System.out.println();
            }   

        } while (!opcio.equals("50"));
    }    
}
