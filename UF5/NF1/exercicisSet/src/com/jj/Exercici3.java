package com.jj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercici3
{
    public static void main(String[] args)
    {
        Set aLista = new HashSet<Integer>( Arrays.asList(1,2,3));
        Set bLista = new HashSet<Integer>( Arrays.asList(3,4,5));

        unio(aLista,bLista);
        interseccio(aLista,bLista);
        resta(aLista,bLista);
        subconjunt(aLista,bLista);
    }

    public static <T> Set <T> unio(Set<T> a, Set<T> b)
    {
        Set<T> unions = new HashSet<T>();

            unions.addAll(a);
            unions.addAll(b);

        System.out.println("unions = " + unions);
        return  unions;
    }


    public static <T> Set <T> interseccio (Set <T> a, Set <T> b)
    {
        Set<T> interseccio = new HashSet<T>();

        interseccio.addAll(a);
        interseccio.retainAll(b);
        System.out.println("interseccio = " + interseccio);
        return interseccio;
    }
    public static <T> Set <T> resta (Set <T> a, Set <T> b)
    {
        Set<T> resta = new HashSet<T>();

        resta.addAll(a);
        resta.removeAll(b);

        System.out.println("resta = " + resta);
        return resta;
    }
    public static <T> boolean subconjunt (Set <T> a, Set <T> b)
    {
        Set<T> subconjunt = new HashSet<T>();

        subconjunt.addAll(b);

        System.out.println("subconjunt = " + subconjunt);
        return subconjunt.contains(a);

    }



}
