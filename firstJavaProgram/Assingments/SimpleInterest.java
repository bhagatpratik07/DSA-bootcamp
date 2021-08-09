package com.pratik;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle value: ");
        float principle = input.nextFloat();

        System.out.print("Enter Rate of Interest: ");
        float interest = input.nextFloat();

        System.out.print("Enter time in years: ");
        float time = input.nextFloat();

        float simpleInterest = principle * interest * time / 100;

        System.out.println("Simple Interest is : " + simpleInterest);
    }
}
