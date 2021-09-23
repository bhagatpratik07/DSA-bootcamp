package com.pratik;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int target = +5;
        System.out.println(linearSearch(array,target));

    }

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
}
