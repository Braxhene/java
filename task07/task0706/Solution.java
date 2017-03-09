package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[15];
        int n1=0, n2=0;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<a.length;i++){
            a[i]=Integer.parseInt(read.readLine());
        }
        //проверяем четность индексов домов
        for (int i=0; i<a.length; i++){
            if (i%2==0){
                n2+=a[i];
            } else n1+=a[i];
        }
        if (n1>n2){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
