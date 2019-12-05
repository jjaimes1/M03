package com.jj;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exercici1
{

    public static void main(String[] args)
    {
        Deque lista1 = new ArrayDeque();
        Deque lista2 = new ArrayDeque();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        System.out.println(lista1);

        invertirPila(lista1,lista2);
        System.out.println(lista2);

        System.out.println("la lista 1: "+lista1);

    }

    public static void invertirPila( Deque x, Deque y)
    {
        for (int i = x.size(); i > 0; i--)
        {
            y.push(x.pop());
        }
    }
}
