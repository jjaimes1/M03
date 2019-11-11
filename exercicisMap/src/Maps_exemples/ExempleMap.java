/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps_exemples;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gmartinez
 */
public class ExempleMap {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<String, Integer>();

        String key="";
        for (int i = 0; i < args.length; i++) {
            key=args[i];
            if (mapa.containsKey(key)){
                mapa.put(key, mapa.get(key)+1);
            }
            else {
                mapa.put(key, 1);
            }
        }

        System.out.println("map: "+mapa);
    }
}
