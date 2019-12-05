package com.lau.exercici1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Exercici1 {
  public static void main(String[] args) {
	
	
     List<Person> listArray = new ArrayList<Person>();
     List<Person> listLinked = new LinkedList<Person>();


     Calendar birthday = Calendar.getInstance();
     birthday.set(1975, 12, 31);;
     
     for(int i=0;i<10000;i++){
        listArray.add(new Person(birthday,"Persona"+i));  
        listLinked.add(new Person(birthday,"Persona"+i));
    }


      /**
       * Inserció per posicio absoluta en ArrayList
       */
     System.out.println("Temps en inserir un element a ArrayList (en nanosegons):");
     long tempsInicial = System.nanoTime();
     listArray.add(new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listArray.add(0,new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listArray.add(5000,new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listArray.add(10000,new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial); 
    
     
     /**
      *  Inserció per posicio absoluta en LinkedList
      */
     System.out.println("Temps en inserir un element a LinkedList (en nanosegons):");
     tempsInicial = System.nanoTime();
     listLinked.add(new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listLinked.add(0,new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listLinked.add(5000,new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listLinked.add(10000,new Person(birthday,"testInsert"));
     System.out.println(System.nanoTime()- tempsInicial); 
     
     
     /**
      * obtenir elements per posicio absoluta en ArrayList
      */
    tempsInicial = System.nanoTime();
    System.out.println("Temps en obtenir un element a ArrayList (en nanosegons):");
    listArray.get(0);
    System.out.println(System.nanoTime()- tempsInicial);
    tempsInicial = System.nanoTime();
    listArray.get(5000);
    System.out.println(System.nanoTime()- tempsInicial);
    tempsInicial = System.nanoTime();
    listArray.get(10000);
    System.out.println(System.nanoTime()- tempsInicial);
    
   
     /**
      *  Obtenir un elemnt per posicio absoluta en LinkedList
      */
    tempsInicial = System.nanoTime();
     System.out.println("Temps en obtenir un element a LinkedList (en nanosegons):");
     tempsInicial = System.nanoTime();
     listLinked.get(0);
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listLinked.get(5000);
     System.out.println(System.nanoTime()- tempsInicial);
     tempsInicial = System.nanoTime();
     listLinked.get(10000);
     System.out.println(System.nanoTime()- tempsInicial); 

  }
}
