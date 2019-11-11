package com.jj;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercici2
{

    public static void main(String[] args)
    {
        Set<Integer> hashSet= new HashSet();
        Set<Integer> linkedHashSet= new LinkedHashSet();
        Set<Integer> treeSet= new TreeSet();

        Long temps1 = System.nanoTime();
        insertElements(hashSet);
        System.out.print("temps HashSet: ");
        System.out.println(System.nanoTime()-temps1);

        Long temps2 = System.nanoTime();
        insertElements(linkedHashSet);
        System.out.print("temps linkedHashSet: ");
        System.out.println(System.nanoTime()-temps2);
        Long temps3 = System.nanoTime();
        insertElements(treeSet);
        System.out.print("temps TreeSet: ");
        System.out.println(System.nanoTime()-temps3);



    }

    public static void insertElements(Set<Integer> s)
    {
        for (int i = 0; i < 1000000; i++) {
            s.add(i);
        }
    }
}
