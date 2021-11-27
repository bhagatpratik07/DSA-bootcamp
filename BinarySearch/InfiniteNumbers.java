package com.pratik;

public class InfiniteNumbers {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,11,13,15,17,19,21,25,36,52};
        int target = 21;
        System.out.println(ans(array,target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    };
    static int binarySearch(int[] arr,int target,int start,int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
