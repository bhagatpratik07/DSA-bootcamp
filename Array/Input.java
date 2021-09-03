package com.pratik;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array of PRIMITIVES
        //int[] arr = {1,2,3,4,5};

//        for (int j : arr) {
//            System.out.print(j + ""); // for every number(j) in array,print the number(j)
//        }


//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        // Array of OBJECTS

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
