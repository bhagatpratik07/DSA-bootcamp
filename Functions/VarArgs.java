package com.pratik;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//    fun(1,2,34,44,76);
    }
    static void fun(int ...arr){
        System.out.println(Arrays.toString(arr));
    }
}
