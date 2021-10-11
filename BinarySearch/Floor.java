package com.pratik;

public class Floor {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,9};
        int target = 3;
        System.out.println(Ceiling(array,target));
    }
    static int Ceiling(int[] array,int target){
        int start = 0;
        int end = array.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == array[mid]){
                return mid;
            }
            if (target > array[mid]){
                start = mid + 1;
            }else if (target < array[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
