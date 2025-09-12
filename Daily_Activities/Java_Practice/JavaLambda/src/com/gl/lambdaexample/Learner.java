package com.gl.lambdaexample;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Learner {
    public static void main(String[] args) {
        BasicCalculator add = (a, b) -> a + b;
        BasicCalculator subtract = (a, b) -> a - b;

        System.out.println("add: " + add.operation(10, 20));
        System.out.println("subtract: " + subtract.operation(10, 20));

        // Using BiFunction (predefined functional interface)
        BiFunction<Integer, Integer, Integer> total = (a, b) -> a + b;
        System.out.println("total from bifunction: " + total.apply(50, 60));

        BiFunction<Double, Integer, Double> multiply = (a, b) -> a * b;
        System.out.println("product from bifunction: " + multiply.apply(50.0, 60));


        // one parameter , one return type [any return type]
        Function<Integer, Integer> square = (a) -> a * a;
        System.out.println("square from function :" + square.apply(5));

        // one parametr , fixed return type [boolean]
        Predicate<String> greetValid = greetMessage -> greetMessage.isEmpty();
        System.out.println("Do i have greetmessage" + greetValid.test("Welcome"));
    }
}
