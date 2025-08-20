package Functional_Interfaces;

import java.util.function.*;

public class FunctionalExamples {
    public static void main(String[] args) {
        // Temperature Alert System
        Predicate<Double> highTempAlert = t -> t > 38.0;
        System.out.println("Temp 39 -> " + highTempAlert.test(39.0));

        // String Length Checker
        Function<String, Integer> lengthChecker = String::length;
        System.out.println("Length of 'HelloWorld' -> " + lengthChecker.apply("HelloWorld"));

        // Background Job Execution
        Runnable job = () -> System.out.println("Running job in background...");
        new Thread(job).start();
    }
}
