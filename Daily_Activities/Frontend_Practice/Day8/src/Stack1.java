import java.util.Stack;

public class Stack1 {
       public static void main(String[] args) {
        Stack<String> fruits=new Stack<>();
        fruits.push("watermelon");
        fruits.push("apple");
        fruits.push("orange");
        fruits.push("banana");

        System.out.println(fruits);

        System.out.println(fruits.pop());
        System.out.println(fruits.peek());
       }
}
