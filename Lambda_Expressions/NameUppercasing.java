
package com.example.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Scenario:
 * Convert all employee names to uppercase for an HR letter.
 * Use String::toUpperCase in a stream.
 */
public class NameUppercasing {

    public static void runDemo() {
        List<String> names = Arrays.asList("Anita", "Bhavesh", "chitra", "deepak");

        List<String> upper = names.stream()
                .map(String::toUpperCase) // method reference
                .collect(Collectors.toList());

        System.out.println(upper);
    }
}
