package com.jj;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Exercici2
{

    public static void main(String[] args)
    {
        Deque minaX = new ArrayDeque();
        Deque minaY = new ArrayDeque();

        int dBlancs=0;
        int dNegres=0;

        String[] diamants = {"<","<","(",")",">",">"};

        minaX.addAll(Arrays.asList(diamants));

        System.out.println("minaX = " + minaX);
        for (int i = 0; i < minaX.size()+1; i++) {

            for (int j = 0; j < minaX.size(); j++) {

                minaY.push(minaX.pop());
                System.out.println("mina Y: "+minaY);
                System.out.println("mina X: "+minaX);
                System.out.println("");
                if (minaY.peek() == "<" && minaX.peek() == ">") {
                    dBlancs++;
                    minaX.pop();
                    minaY.pop();
                }
                if (minaY.peek() == "(" && minaX.peek() == ")") {
                    dNegres++;
                    minaX.pop();
                    minaY.pop();
                }
            }

            invertirPila(minaY, minaX);
        }
        System.out.println("minaX = " + minaX);
        System.out.println("dBlancs = " + dBlancs);
        System.out.println("dNegres = " + dNegres);
    }

    public static void invertirPila( Deque x, Deque y)
    {
        for (int i = x.size(); i > 0; i--)
        {
            y.push(x.pop());
        }
    }
}
