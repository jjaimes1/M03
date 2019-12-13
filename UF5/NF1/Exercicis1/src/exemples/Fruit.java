package exemples;

import java.util.Collections;
import java.util.Comparator;



/**
 *  ORDENACIÓ D'OBJECTES AMB COMPARABLE
 * 
 * Per poder utilitzar l'ordenació sobre els objectes fruites s'haurà d'implementar comparable 
 *
 */
public class Fruit implements Comparable<Fruit>{
    private String color;
    private String name;


    public Fruit(String name, String color) {
        super();
        this.name = name;
        this.color = color;
    }

    public Fruit(String color, String name, int num){
        super();
        this.color = color;
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public int compareTo(Fruit fruit) {
        // TODO Auto-generated method stub

        // "Collections.sort(fruits);" de SortFruit.java ordena en funció d'aquest mètode.

        /**
         * Suposem que volem ordenar en funció de qui té el nom més curt.
         */
        /*if (this.name.length()<fruit.getName().length()) return -1;
        else if (this.name.length() == fruit.getName().length()) return 0;
        else return 1;*/

        //Seria el mateix que fer:
        //return (getName().length() - fruit.getName().length());

        /**
         * Volem ordenar alfabèticament, la classe String implementa la funció compareTo
         */
        return getName().compareTo(fruit.getName());
        //return getColor().compareTo(fruit.getColor());
    }
	
}