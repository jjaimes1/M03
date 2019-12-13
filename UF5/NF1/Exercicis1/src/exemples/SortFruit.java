package exemples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ORDENACIÓ D'OBJECTES AMB COMPARABLE
 * 
 */
public class SortFruit {
    public static void main(String[] args) {
        int i;

        List<Fruit> fruits = new ArrayList<Fruit>();
        // "Pineapple", "Apple", "Orange","Banana"
        Fruit pineapple = new Fruit("pineapple", "black");
        Fruit apple = new Fruit("apple", "yellow");
        Fruit orange = new Fruit("orange", "orange");
        Fruit banana = new Fruit("banana", "yellow");

        fruits.add(pineapple);
        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);
        System.out.println("LLista original:");
        i = 0;
        for (Fruit temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp.getName() + " : " + temp.getColor());
        }
        
        /**
         * Si la classe fruit no implementa compareTo no se sabrà quin és el
         * criteri d'ordenació ens donaria un error tipus cannot be cast to
         * java.lang.Comparable
         */

        // void Collections.sort(List<T> list); = Sorts the specified list into ascending order, according 
        // to the natural ordering of its elements.
        // Info en: https://docs.oracle.com/javase/6/docs/api/java/util/Collections.html baixar fins al
        // mètode "sort".

        System.out.println();
        System.out.println("LLista ordenada en funció del mètode compareTo() de Fruit.java:");
        Collections.sort(fruits);	//Ordena en funció del codi que fiquem en el mètode "compareTo()" de Fruit.java.
        i = 0;
        for (Fruit temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp.getName() + " : " + temp.getColor());
        }
        /**
        * SORTIDA 
        * fruits 1 : apple 
        * fruits 2 : banana 
        * fruits 3 : orange 
        * fruits 4 : pineapple
        */

        // Podem ordenar per altres atributs, per exemple alfabeticament pel color.
        // Per fer això necessito un "Comparator" de fruites. Puc programar-ho directament o
        // en previsió de què voldré reaprofitat el codi una funció em pot retornar el comparator.
        // void Collections.sort(List<T> list, Comparator<? super T> c);  =  Sorts the specified list according 
        // to the order induced by the specified comparator.
        System.out.println();
        System.out.println("LLista ordenada en funció d'un Comparator:");
        ColorComparator colorComparator = new ColorComparator();
        Collections.sort(fruits, colorComparator);
        i = 0;
        for (Fruit temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp.getName() + " : " + temp.getColor());
        }
        

        System.out.println();
        System.out.println("LLista ordenada en funció del mètode compareTo() de Fruit.java:");
        List<Fruit> fruits2 = new ArrayList<Fruit>();
        //Està fent servir el 2n constructor ("public Fruit(String color, String name, int num)").
        Fruit pineapple2 = new Fruit("black", "pineapple", 0);
        Fruit apple2 = new Fruit("yellow", "apple", 0);
        Fruit orange2 = new Fruit("orange", "orange", 0);
        Fruit banana2 = new Fruit("yellow","banana", 0);

        fruits2.add(pineapple2);
        fruits2.add(apple2);
        fruits2.add(orange2);
        fruits2.add(banana2);

        Collections.sort(fruits2);

        i = 0;
        for (Fruit temp2 : fruits2) {
            System.out.println("fruits2 " + ++i + " : " + temp2.getName() + " : " + temp2.getColor());
        }
        System.out.println();

    }
}
