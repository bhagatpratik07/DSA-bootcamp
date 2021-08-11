package com.pratik;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float radius = input.nextFloat();

        float area = 3.14f * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}
