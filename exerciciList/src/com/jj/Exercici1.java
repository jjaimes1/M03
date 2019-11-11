package com.jj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercici1
{

    /*

Exercici 1.
Utilitza la interfície List <E> per guardar una llista de números.
Els números es passaran a través dels arguments del programa i es
transformaran en enters amb el mètode parseInt de la classe Integer,
per després afegir-los al final de la llista amb el mètode add.
Quan ja no hi hagi més números, imprimeix el número d'elements llegits (size).
Després eleva tots els elements al quadrat (amb get i set).
Recórre la llista i suprimeix els números majors de 100 (amb Iterator).
Ara ordena'ls (amb sort de la classe Collections).
Finalment amb for(Integer element: numbersList) mostra els elements per pantalla.
Passar arguments executant des de l'Eclipse → Botó dret > run As >
Run configurations > Segona pestanya Arguments > I escriure els arguments
separats per espais a program arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {
            numbers.add(Integer.parseInt(args[i]));
        }
        System.out.println("A la llista hi ha:" + numbers.size() + " numeros");

        for (int i = 0; i < numbers.size(); i++) {
            Integer element = numbers.get(i);
            Double cuadrado = Math.pow(element, 2);
            numbers.set(i, new Integer(cuadrado.intValue()));
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() > 100) {
                it.remove();
            }

        }
        Collections.sort(numbers);
        for (Integer element : numbers) {
            System.out.println(element.toString());
        }
    }
}
















