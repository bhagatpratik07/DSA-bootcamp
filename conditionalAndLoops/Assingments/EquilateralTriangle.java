package com.pratik;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter area: ");
        float area = input.nextFloat();

        double triangle = (Math.sqrt(3) / 4) * area * area ;
        System.out.println(triangle);
    }

}
