package com.pratik;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String greet = greeting(name);
        System.out.println(greet);
    }
    static String greeting(String name){
        String message = "Hello " + name;
        return message;
    }
}
