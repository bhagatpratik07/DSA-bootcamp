package com.pratik;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float radius = input.nextFloat();

        float perimeter = 2 * 3.14f * radius ;

        System.out.println(perimeter);
    }
}
