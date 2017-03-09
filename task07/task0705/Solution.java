package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrbig = new int[20];
        int[] arrsm1 = new int[10];
        int[] arrsm2 = new int[10];
        System.out.println("Введите любое целое число 20 раз");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<arrbig.length; i++){
            arrbig[i]=Integer.parseInt(read.readLine());
        }

        arrsm1=Arrays.copyOf(arrbig, 10);
        arrsm2=Arrays.copyOfRange(arrbig,arrbig.length-10,arrbig.length);

        for (int i=0; i<arrsm2.length;i++){
            System.out.println(arrsm2[i]);
        }
    }
}
