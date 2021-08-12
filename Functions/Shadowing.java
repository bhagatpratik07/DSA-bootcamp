package com.pratik;

public class Shadowing {
    static int x = 5; // shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 5
        int x = 10;
        System.out.println(x); // 10
        hey(); // 5
    }
    static void hey(){
        System.out.println(x);
    }
}
