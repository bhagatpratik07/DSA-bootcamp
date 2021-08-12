package com.pratik;


public class Swap {
    public static void main(String[] args) {
        // this will not work because we are creating new object
        // pass by value
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
// notes

// swap and psvm are pointing to seprate objects

