/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps_exemples;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author gmartinez
 */
public class HashTableDemo {
    public static void main(String args[]) {
        //És millor fer servir HashMap perquè permet null's i perquè no és sincronitzat (permet
        //que diverses tarees poguin accedir al mateix temps al HashMap). Hashtable no admet null's
        //i només una tarea pot accedir a l'hora.
        
        // Create a Hashtable map.
        Hashtable ht = new Hashtable();
        Enumeration names;
        String str;
        double balance;

        ht.put("Zara", new Double(3434.34));
        ht.put("Mahnaz", new Double(123.22));
        ht.put("Ayan", new Double(1378.00));
        ht.put("Daisy", new Double(99.22));
        ht.put("Qadir", new Double(-19.08));

        // Show all balances in Hashtable map.
        names = ht.keys();

        System.out.println("Hashtable original:");
        while(names.hasMoreElements()) {
           str = (String) names.nextElement();
           System.out.println(str + ": " + ht.get(str));
        }        

        // Deposit 1,000 into Ayan's account.
        balance = ((Double)ht.get("Ayan")).doubleValue();
        ht.put("Ayan", new Double(balance + 1000));
        System.out.println();
        System.out.println("Ayan incrementat en 1000:");
        System.out.println(ht.get("Ayan"));
   }

    /*SORTIDA DEL PROGRAMA:
        Hashtable original:
        Zara: 3434.34
        Mahnaz: 123.22
        Ayan: 1378.0
        Daisy: 99.22
        Qadir: -19.08
    
        Ayan incrementat en 1000:
        2378.0
    */  
}
