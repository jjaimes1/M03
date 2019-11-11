package ExercicisStack;

import java.util.ArrayDeque;
import java.util.Deque;



public class Exercici1 {
    public static void main(String[] args) {
        Deque<Integer> stackDeque = new ArrayDeque<Integer>();
        
        Integer elem1 = new Integer(1);
        Integer elem2 = new Integer(2);
        Integer elem3 = new Integer(3);
        Integer elem4 = new Integer(4);
        
        stackDeque.push(elem1);
        stackDeque.push(elem2);
        stackDeque.push(elem3);
        stackDeque.push(elem4);
        
        printDeque(stackDeque, "Deque (pila) original:");
        
        System.out.println();
        invertirPila(stackDeque);
    }
    

    public static <T> void invertirPila(Deque<T> stack) {
        Deque<T> inversStack = new ArrayDeque<T>();
        while (!stack.isEmpty()) {
            inversStack.push(stack.pop());
        }
        printDeque(inversStack, "Deque (pila) invertida:");
    }
    

    public static void printDeque(Deque<?> stack, String text) {
        System.out.println(text);
        for (Object elem:stack){
            System.out.println(elem.toString());
        }
    }

}