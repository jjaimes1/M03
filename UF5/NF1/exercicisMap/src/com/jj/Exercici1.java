/*
 * Copyright (c) 2019.
 * Made by JJ Company
 */

package com.jj;


import Maps_exemples.Persona;

import java.util.*;

public class Exercici1 {
    public static void main(String[] args) {


        LinkedHashMap<String, Vehicle> listVeicle = new LinkedHashMap<String, Vehicle>();
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        listVeicle.put("B8240KY", new Vehicle("Blanco", "Opel", "kadet", 1990));
        listVeicle.put("8040BGZ", new Vehicle("Rojo", "Seat", "panda", 1985));
        listVeicle.put("8140BGZ", new Vehicle("Negro", "Seat", "leon", 2005));
        listVeicle.put("8240BGZ", new Vehicle("Azul", "Volkswagen", "passat", 2007));

        System.out.println(listVeicle);

        Set set = listVeicle.entrySet();

        Iterator it1 = set.iterator();

        while (it1.hasNext()) {
            Map.Entry me = (Map.Entry) it1.next();

            System.out.println(me.getValue());


            // System.out.println(me.getKey() + ": " + vehicles.get);
            //System.out.println();
            //System.out.println(me.getValue());
        }

        System.out.println("empieza el ejercicio: borra los coches antes de 1995");
        System.out.println("-------------------------------");

        for (Map.Entry<String, Vehicle> dada : listVeicle.entrySet()) {
            if (dada.getValue().any >= 1995)
            {
                System.out.println(dada.getKey() + "  "+ dada.getValue());
            }
        }

        System.out.println("busca los coches del color deseado");
        System.out.println("-------------------------------");

        ArrayList listColor = new ArrayList();
        for (Map.Entry<String, Vehicle> dada : listVeicle.entrySet()) {
            if (dada.getValue().color == "Blanco")
            {
                System.out.println(dada.getKey() + "  "+ dada.getValue());
                listColor.add("Matricula: "+ dada.getKey()+"\nDades del cotxe: "+ dada.getValue());

            }
        }

        System.out.println(listColor);


    }
}

