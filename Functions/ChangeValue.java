package com.pratik;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // pointing towards same value/object
        int[] array = {1,2,3,4,5};
        change(array);
        System.out.println(Arrays.toString(array));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
// notes

// change() and array are pointing towards same object