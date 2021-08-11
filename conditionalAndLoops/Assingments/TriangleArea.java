package com.pratik;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        float height = input.nextFloat();

        System.out.print("Enter base: ");
        float base = input.nextFloat();

        float area = (height * base) / 2;

        System.out.println("Area of triangle is: " + area);
    }
}
