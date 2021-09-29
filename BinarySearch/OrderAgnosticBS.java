package com.pratik;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int target = 5;
        System.out.println(OrderAgnostic(array,target));
    }
    static int OrderAgnostic(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

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
