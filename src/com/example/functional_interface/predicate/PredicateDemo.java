package com.example.functional_interface.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {


        // traditional form of check if it even or not
        boolean status = checkEvenOrNot(10);
        System.out.println("even or not status : " + status);


        // Predicate is Function interface which input as parameter and output as boolean
        Predicate<Integer> evenOrNot = x -> x % 2 == 0;
        System.out.println(evenOrNot.test(10));


    }

    private static boolean checkEvenOrNot(int value) {
        return value % 2 == 0;
    }
}
