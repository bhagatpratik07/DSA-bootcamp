package com.pratik;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter currency in rupee: ");
        float rupee = input.nextFloat();

        float dollar = rupee / 61.06f;
        System.out.println("Currency in dollar: " + dollar);
    }
}
