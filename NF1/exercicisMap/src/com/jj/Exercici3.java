/*
 * Copyright (c) 2019.
 * Made by JJ Company
 */

package com.jj;

import java.util.*;

public class Exercici3
{
    public static void main(String[] args)
    {
        SortedMap<String, Contacte> contactos = new TreeMap<String, Contacte>();

        Scanner entradaTeclado = new Scanner(System.in);

        String entrada1="";

        contactos.put("pepito", new Contacte("holaquehace@yopmail.com",666333111, "calle falsa 666"));
        contactos.put("angel", new Contacte("holaquehace@yopmail1.com",555333111, "calle falsa 555"));
        contactos.put("carlos", new Contacte("holaquehace@yopmail2.com",444333111, "calle falsa 444"));
        contactos.put("bryan", new Contacte("holaquehace@yopmail3.com",333222111, "calle falsa 333"));
        contactos.put("juan", new Contacte("holaquehace@yopmail4.com",222333111, "calle falsa 222"));
        contactos.put("manolo", new Contacte("holaquehace@yopmail5.com",111333111, "calle falsa 111"));

      //  System.out.println(contactos);

        System.out.println("introduce un nombre");

        entrada1=entradaTeclado.nextLine();

        dameTelf(entrada1, contactos);
        dameCorreo(entrada1, contactos);
    }

    public static void dameTelf(String nombre, SortedMap<String, Contacte> lista)
    {
        for (Map.Entry<String, Contacte> mapeo : lista.entrySet())
        {
            if (nombre.equals(mapeo.getKey()))
            {
                System.out.println("======================================");
                System.out.println("el telefon de: " + nombre +" es: " + mapeo.getValue().telefon);
                System.out.println("======================================");
                break;
            }
        }
    }
    public static void dameCorreo(String nombre, SortedMap<String, Contacte> lista)
    {
        for (Map.Entry<String, Contacte> mapeo : lista.entrySet())
        {
            if (nombre.equals(mapeo.getKey()))
            {
                System.out.println("=================================================");
                System.out.println("el correo de: " + nombre +" es: " + mapeo.getValue().coreu);
                System.out.println("=================================================");
                break;
            }
        }
    }
}
