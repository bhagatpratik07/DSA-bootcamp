package com.pratik;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,200,3,45,62,108};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,4));
    }
    static int max(int[] arr){

        if (arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int maxRange(int[] arr,int start,int end){

        if(end > start){
            return -1;
        }

        if (arr == null){
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
