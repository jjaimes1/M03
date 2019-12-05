package com.jj;

import java.util.HashSet;
import java.util.Set;

public class Exercici4
{
    public static void main(String[] args)
    {
        //parametros/texto pasado por argumento (arg)

        Set aLista = new HashSet();
        Set bLista = new HashSet();

        for (int i = 0; i < args.length; i++)
        {
            aLista.add(args[i]);
            bLista.add(args[i]);

        }

    }
}
