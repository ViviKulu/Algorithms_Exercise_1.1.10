package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

//    What is wrong with the following code fragment?

//    int[] a;
//    for (int i = 0; i < 10; i++)
//    a[i] = i * i;
//
//    Answer:

//    It does not allocate memory for a[] with new. This code results in a
//    variable a might not have been initialized compile-time error.

    public static void main(String[] args) {
        // write your code here with allocated memory
        int[] a = {5,6,7,8,9,4,3,2,1,0};
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
        System.out.println(Arrays.toString(a));
    }
}
