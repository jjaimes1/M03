package exemples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemple2 {
    public static void main(String[] args) {
        String[] fruits = new String[] { "Pineapple", "Apple", "Orange","Banana" };

        Arrays.sort(fruits);

        int i = 0;
        for (String temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp);
        }
        /**
         * SORTIDA
         * fruits 1 : Apple 
         * fruits 2 : Banana 
         * fruits 3 : Orange 
         * fruits 4 : Pineapple
         */


        List<String> fruitsList = new ArrayList<String>();

        fruitsList.add("Pineapple");
        fruitsList.add("Apple");
        fruitsList.add("Orange");
        fruitsList.add("Banana");

        Collections.sort(fruitsList);

        i=0;
        for(String temp: fruits){
            System.out.println("fruits " + ++i + " : " + temp);
        }
        /**
         * SORTIDA
         * fruits 1 : Apple 
         * fruits 2 : Banana 
         * fruits 3 : Orange 
         * fruits 4 : Pineapple
         */

    }

}