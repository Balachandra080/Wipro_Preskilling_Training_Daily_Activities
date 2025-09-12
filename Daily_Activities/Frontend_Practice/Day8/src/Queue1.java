package src;

import java.util.ArrayDeque;


public class Queue1 {
    public static void main(String[] args) {
        ArrayDeque<String> animals=new ArrayDeque<>();
        animals.add("dog");
        animals.add("lion");
        animals.add("tiger");
        System.out.println(animals);

        animals.push("elephant");
        System.out.println(animals);

        System.out.println(animals.peekFirst());
         System.out.println(animals.peekLast());

            
    
    }

}
