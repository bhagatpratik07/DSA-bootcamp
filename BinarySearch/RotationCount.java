package com.pratik;

public class RotationCount {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
        int arr[] = {7, 9, 11, 12, 15};
        System.out.println(ans(arr));
//        System.out.println(findPivot(arr));
    }

    static int ans(int[] arr){
        int pivot = findPivot(arr);

        if (pivot == -1){
            return 0;
        }else {
            return pivot + 1;
        }
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start + 1) / 2;

            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // case 3
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
