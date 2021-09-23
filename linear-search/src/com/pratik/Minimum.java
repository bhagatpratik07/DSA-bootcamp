package com.pratik;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {5,38,9,26,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){


        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;
    }
}
