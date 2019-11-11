import java.util.ArrayList;
import java.util.LinkedList;

public class exercici1
{

    /*
      Exercici 1.
        Crea dues llistes una implementada amb linkedlist i l'altre amb arrayList i afegeix a cada una d'elles 10.000 elements.
        -  Insereix a cada una d'elles un element (sense especificar la funció) i mostra el temps que el sistema ha tardat en fer
         la inserció (long tempsInicial = System.nanoTime();)
        - Insereix un element a l'inici de la llista, mostra el temps i compara el temps entre les dos llistes i amb els resultats anteriors
        -  Insereix a cada una d'elles un element a la posició 5.000 de la llista i compara el temps entre les dos llistes i amb els resultats anteriors
        -  Insereix a cada una d'elles un element a la posició 10.000 de la llista i compara el temps entre les dos llistes i amb els resultats anteriors


     */

    public static void main(String[] args)
    {
        LinkedList linkElements = new LinkedList();
        ArrayList   arrayElements = new ArrayList();

        long tempsInicial = System.nanoTime();

        //linkedList

        for (int i = 0; i < 10000; i++) // temps: 4974734334211
        {
            linkElements.add(i);
        }

            //insercio a la posicio 5000        temps: 54930
            //insercio a la posicio 10000       temps: 9130

            //obtencio a la posicio 5000        temps: 320970
            //obtencio a la posicio 10000        temps: 262742
        long x= System.nanoTime();
            //linkElements.add(10000,3);

        System.out.println(linkElements.get(9999));

        System.out.println(System.nanoTime()-x);


/*
        //ArrayList
        for (int i = 0; i < 10000; i++) // temps: 5415525367123
        {
            arrayElements.add(i);
        }

            //insercio a la posicio 5000        temps: 15425
            //insercio a la posicio 10000       temps: 13901

            //obtencio a la posicio 5000        temps: 253393
            //obtencio a la posicio 10000        temps: 244095
        long x= System.nanoTime();
        //arrayElements.add(10000,3);
        System.out.println(arrayElements.get(9999));

        System.out.println(System.nanoTime()-x);
*/
        System.out.println(tempsInicial);
    }

}
