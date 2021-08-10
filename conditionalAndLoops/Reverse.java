package com.pratik;

public class Reverse {
    public static void main(String[] args) {
        int number = 1234;
        int reverseNumber = 0;

        while (number > 0){
            int rem = number % 10; // 4,3
            number = number / 10; // 123,12

            reverseNumber = reverseNumber * 10 + rem; // 0 * 10 + 4 = 4 ; 4 * 10 + 3 = 43
        }

        System.out.println(reverseNumber);
    }
}
