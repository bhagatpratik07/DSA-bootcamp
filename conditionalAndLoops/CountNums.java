package com.pratik;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int checkNum = input.nextInt();

        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == checkNum){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
