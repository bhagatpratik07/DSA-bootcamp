package com.pratik;

public class Overloading {
    public static void main(String[] args) {
        fun("Pratik");
        fun(5);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

// NOTES

// two functions with same name can exist only if their parameters are different