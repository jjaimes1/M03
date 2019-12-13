/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps_exemples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gmartinez
 */
public class LinkedHashMapDemo {
    public static void main(String args[]) {
        // Create a linked hash map (ordenat en funció de l'ordre d'entrada en el map).
        LinkedHashMap lhm = new LinkedHashMap();

        // Put elements to the LinkedHashMap.
        lhm.put("Zara", new Double(3434.34));
        lhm.put("Mahnaz", new Double(123.22));
        lhm.put("Ayan", new Double(1378.00));
        lhm.put("Daisy", new Double(99.22));
        lhm.put("Qadir", new Double(-19.08));

        // Get a set of the entries.
        Set set = lhm.entrySet();

        // Get an iterator.
        Iterator i = set.iterator();

        // Display elements
        System.out.println("LinkedHashMap original:");
        while(i.hasNext()) {
           Map.Entry me = (Map.Entry)i.next();
           System.out.println(me.getKey() + ": " + me.getValue());
        }

        // Deposit 1000 into Daisy's account.
        double balance = ((Double)lhm.get("Daisy")).doubleValue();
        lhm.put("Daisy", new Double(balance + 1000));
        System.out.println();
        System.out.println("Daisy incrementat en 1000:");
        System.out.println(lhm.get("Daisy")); 
    }

    /*SORTIDA DEL PROGRAMA:
        LinkedHashMap original:
        Zara: 3434.34
        Mahnaz: 123.22
        Ayan: 1378.0
        Daisy: 99.22
        Qadir: -19.08
    
        Daisy incrementat en 1000:
        1099.22
    */    
}
