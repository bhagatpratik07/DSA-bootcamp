package com.pratik;

public class MountainArray {
    public static void main(String[] args) {
// https://leetcode.com/problems/find-in-mountain-array/
    }
    static int ans(int[] arr, int target){
      int peak = peakIndexInMountainArray(arr);
      int firstTry = OrderAgnostic(arr,target,0,peak);

      if (firstTry != -1){
          return firstTry;
      }else {
        return OrderAgnostic(arr,target,peak+1,arr.length-1);
      }
    };
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // dec order
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int OrderAgnostic(int[] arr,int target,int start,int end){
//        int start = 0;
//        int end = arr.length - 1;

        boolean ascending = arr[end] > arr[start];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (ascending){

                if (target > arr[mid]){
                    start = mid + 1;
                }else if(arr[mid] > target){
                    end = mid - 1;
                }

            }

            else {
                if (target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

