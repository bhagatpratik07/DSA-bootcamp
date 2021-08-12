package com.pratik;

public class Scoping {
    public static void main(String[] args) {
//         block scope
          int a = 10;
//         this can be accessed inside the block
        {
             int c = 30;
//         c cannot be accessed outside this block
        }
//       System.out.println(c);

    }
}
