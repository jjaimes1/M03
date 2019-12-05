package com.jj;

import java.lang.reflect.Array;
import java.util.*;

public class Exercici1
{
    public static void main(String[] args)
    {
        ordreInsercio();
    }

    public static void ordreInsercio()
    {
        HashSet hashSet= new HashSet();
        LinkedHashSet linkedHashSet= new LinkedHashSet();
        TreeSet treeSet= new TreeSet();
        List listaOriginal = Arrays.asList("groc", "blau", "verd", "vermell");
        System.out.println(listaOriginal+"\n");

        for (int i = 0; i < listaOriginal.size(); i++) {
            hashSet.add(listaOriginal.get(i));
            linkedHashSet.add(listaOriginal.get(i));
            treeSet.add(listaOriginal.get(i));
        }
        System.out.println("hashSet =       " + hashSet);
        System.out.println("linkedHashSet = " + linkedHashSet);
        System.out.println("treeSet =       " + treeSet);
    }
}
