package com.neha.HelloApp;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            System.out.print("Hello ");

            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                // Add comma except for last name
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}