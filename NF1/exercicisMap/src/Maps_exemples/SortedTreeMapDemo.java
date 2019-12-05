/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps_exemples;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


/**
 *
 * @author gmartinez
 */
public class SortedTreeMapDemo {
    public static void main(String args[]) {
        //Ordenarà els elements en funció de la clau.        
        SortedMap<String, Persona> stm = new TreeMap<String, Persona>();

        //Put elements to the map.
        //Com hi ha 2 elements repetis perquè tenen la mateix clau ("aaa"), la 2a vegada que introduim
        //un element amb la clau "aaa" machacarà el valor que hi havia previament.
        //El mapa estarà ordenat per la clau.
        stm.put("aaa", new Persona("aaa", 10));
        stm.put("aaa", new Persona("aaa", 20));
        stm.put("aaa2", new Persona("aaa", 20));
        stm.put("bbb", new Persona("bbb", 500));
        stm.put("ccc", new Persona("ccc", 600));
        stm.put("ccc2", new Persona("ccc", 600));
        stm.put("ddd", new Persona("ddd", 700));
        
        System.out.println("Contingut del \"SortedMap<String, Persona> stm = new TreeMap<String, Persona>()\":");
        for (Entry<String, Persona> dada : stm.entrySet()) {
            System.out.println("Clau: " + dada.getKey().toString() + ", nom: " + dada.getValue().getNom() + ", edat: " + dada.getValue().getEdat());
        }
        
        //https://www.programcreek.com/2013/03/java-sort-map-by-value/
        //Crearem un TreeMap "mapaOrdenatPerEdat" on els elements estaran ordenats per la edat (que està 
        //dins del valor) i no per la clau. A llavors com és un TreeMap no hi poden haver repetits i
        //com ordenarà per edat, no podran haver-hi més d'una persona amb la mateixa edat.
        Map mapaOrdenatPerEdat = new TreeMap(new comparadorPerEdat(stm));   //"comparadorPerEdat" està definit a baix de tot.
        mapaOrdenatPerEdat.putAll(stm);
        
        System.out.println();
        System.out.println("Contingut del \"Map mapaOrdenatPerEdat = new TreeMap(new comparadorPerEdat(stm))\":");
        Iterator<String> it = mapaOrdenatPerEdat.keySet().iterator();
        while (it.hasNext()) {
            String clau = it.next();
            System.out.println("Clau: " + clau + ", " + mapaOrdenatPerEdat.get(clau).toString());
        }
    }
}


class comparadorPerEdat implements Comparator {
    Map mapa;

    public comparadorPerEdat(Map mapa){
        this.mapa = mapa;
    }

    //Al fer un MapTree fent servir aquest Comparator, es farà servir la funció compare()
    //per a determinar la posició en l'arbre ordenat i evidentment no hi podran haver elements 
    //repetits dins de l'arbre (la funció compare() determina quan 2 elements són iguals
    //perquè ocupen la mateix posició d'ordenació en l'arbre). 
    //Com està agafant objectes de tipus Persona, quan és fa "return valorA.compareTo(valorB)"
    //en realitat està fent servir la funció compareTo() que hi ha dins de Persona i que està 
    //comparant dues persones en funció de la edat.
    public int compare(Object clauOb1, Object clauOb2){
        Comparable valorA = (Comparable) mapa.get(clauOb1);
        Comparable valorB = (Comparable) mapa.get(clauOb2);
        return valorA.compareTo(valorB);
    }
}
