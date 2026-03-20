package com.neha.HelloApp;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Step 1: Check if the user passed a name via command-line arguments
        // Step 2: Use "World" as a fallback if the array is empty
        String name = (args.length > 0) ? args[0] : "World";

        // Step 3: Display the personalized greeting
        System.out.println("Hello " + name + "!");
    }
}