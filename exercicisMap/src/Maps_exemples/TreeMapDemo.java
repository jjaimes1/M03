/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps_exemples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author gmartinez
 */
public class TreeMapDemo {
    public static void main(String args[]) {
        //Declarem el abre com TreeMap de manera que ordena els elements a partir de 
        //la clau de forma natural, per exemple: els String els ordenarà alfabèticament.
        
        // Create a tree map.
        TreeMap tm = new TreeMap();

        // Put elements to the map.
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));

        // Get a set of the entries.
        Set set = tm.entrySet();

        // Get an iterator.
        Iterator i = set.iterator();

        // Display elements.
        System.out.println("TreeMap original:");
        while(i.hasNext()) {
           Map.Entry me = (Map.Entry)i.next();
           System.out.println(me.getKey() + ": " + me.getValue());
        }

        // Deposit 1000 into Mahnaz's account
        double balance = ((Double)tm.get("Mahnaz")).doubleValue();
        tm.put("Mahnaz", new Double(balance + 1000));
        System.out.println();
        System.out.println("Mahnaz's new balance: " + tm.get("Mahnaz"));
    }

    /*
    SORTIDA DEL PROGRAMA:
        Ayan: 1378.0
        Daisy: 99.22
        Mahnaz: 123.22
        Qadir: -19.08
        Zara: 3434.34

        Mahnaz incrementat en 1000:
        1123.22
    */    
}
