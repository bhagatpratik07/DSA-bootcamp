package com.pratik;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // first two numbers of fibonacci series
        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a; // adding previous two numbers of series
            a = temp; // previous value of b becomes a now.
            count++;
        }
        System.out.println(b);
    }
}
