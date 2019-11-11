/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps_exemples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author gmartinez
 */
public class HashMapDemo {
    public static void main(String args[]) {
        String clau;
        // Create a hash map (no hi ha cap ordre dels elements del map).
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // Put elements to the HashMap.
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));
        //hm.put("Daisy", new Double(-5000));   //Aquest sobreescriuria la entrada anterior perquè tenen la mateixa clau.
        
        
        //1a forma de visualitzar el contingut del map:
        // Get a set of the entries.
        Set set = hm.entrySet();

        // Get an iterator.
        Iterator it1 = set.iterator();

        // Display elements.
        System.out.println("1a forma de visualitzar el contingut del map (map->set):");
        while(it1.hasNext()) {
           Map.Entry me = (Map.Entry)it1.next();
           System.out.println(me.getKey() + ": " + me.getValue());
        }
        
        
        //2a forma de visualitzar el contingut del map:
        System.out.println();
        System.out.println("2a forma de visualitzar el contingut del map (iterator de map):");
        Iterator<String> it2 = hm.keySet().iterator();
        while (it2.hasNext()) {
            clau = it2.next();
            System.out.println(clau + ": " + hm.get(clau));
        }
        
        
        //3a forma de visualitzar el contingut del map:
        System.out.println();
        System.out.println("3a forma de visualitzar el contingut del map (for-each):");
        for (Entry<String, Double> dada : hm.entrySet()) {
            System.out.println(dada.getKey() + ": " + dada.getValue().toString());
        }
        

        // Deposit 1000 into Zara's account.
        double balance = ((Double)hm.get("Zara")).doubleValue();
        hm.put("Zara", new Double(balance + 1000));
        System.out.println();
        System.out.println("Zara incrementat en 1000:");
        System.out.println(hm.get("Zara")); 
    }

    /*
    SORTIDA DEL PROGRAMA:
        HashMap original:
        Daisy: 99.22
        Ayan: 1378.0
        Zara: 3434.34
        Qadir: -19.08
        Mahnaz: 123.22

        Zara incrementat en 1000:
        4434.34
    */    
}
