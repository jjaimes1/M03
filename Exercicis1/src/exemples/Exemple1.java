package exemples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Exemple1 {
    public static void main(String[] args) {
	//Declarar una llista.
        List<String>  strList = new ArrayList<String>();
	 
        //Afegir elements:
        System.out.println("Afegir elements:");
        System.out.println("LLista inicial: " + strList);
        strList.add("frase1");
        strList.add("frase2");
        strList.add("frase3");
        System.out.println("LLista final: " + strList);
	 
        //Afegir element per posició:
        System.out.println("Afegir element per posició (0):");
        System.out.println("LLista inicial: " + strList);
        strList.add(0, "frase0");
        System.out.println("LLista final: " + strList);

        //Saber si existeix l'element:
        boolean existeix = strList.contains("frase0");
        System.out.println("Existeix 'frase0'?: " + String.valueOf(existeix));
        
        //Saber en quina posició està l'element:
        int posElement = strList.indexOf("frase2");
        System.out.println("Posició 'frase2'?: " + posElement);
        posElement = strList.indexOf("frase2222");
        System.out.println("Posició 'frase2222'?: " + posElement);
        
        //Agafar un element de la llista:
        System.out.println("Element en la posició 3: " + strList.get(3));

        //Saber el tamany de la llista:
        System.out.println("Tamany llista: " + strList.size());
        

        //Recórrer la llista:
        //VERSIÓ1:
        System.out.println();
        System.out.println("Recorregut llista VERSIO1 (bucle for-each):");
        for (String element:strList){
            System.out.println(element);
        }

        //VERSIÓ2:
        System.out.println();
        System.out.println("Recorregut llista VERSIO2 (per tamany):");
        for(int i=0; i<strList.size(); i++){
            System.out.println(strList.get(i));
        }

        //VERSIÓ3. Recorrem la llista de principi a final amb "iterator".
        System.out.println();
        System.out.println("Recorregut llista VERSIO3 (amb iterator):");
        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //VERSIÓ4. Recorrem la llista de final a principi i per a poder fer-ho fem
        //servir l'iterador "listIterator" en comptes de "iterator".
        //"listIetrator" permet recorre la llista cap en davant i cap enrera.
        System.out.println();
        System.out.println("Recorregut llista VERSIO4 (amb listIterator):");
        ListIterator<String> listIt = strList.listIterator();

        System.out.println("Recorregut llista cap en davant:");
        while(listIt.hasNext()){
            System.out.println(listIt.next());
        }
        System.out.println();
        System.out.println("Recorregut llista cap enrera:");
        while(listIt.hasPrevious()){
            System.out.println(listIt.previous());
        }
        
        
        //Eliminar elements:
        System.out.println();
        System.out.println("Esborrem per posició (1) i ocurrència ('frase2').");
        System.out.println("LLista inicial: " + strList);
        strList.remove(1);                                  //Eliminar per posició.
        strList.remove("frase2");                           //Eliminar la 1a ocurrència.
        System.out.println("LLista final: " + strList);

    }
 
}