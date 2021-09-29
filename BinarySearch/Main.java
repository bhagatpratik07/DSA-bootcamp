package com.pratik;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-12,-7,-1,0,4,18,25,46,79};
        int ans = binary(arr,-12);
        System.out.println(ans);
    }
    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
