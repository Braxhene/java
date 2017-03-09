package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] count = new String[10];
        int[] numb = new int[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текс 10 раз");
        for (int i=0;i<count.length;i++){
            count[i] = read.readLine();
        }

        for (int i=0;i<numb.length;i++){
            numb[i]=count[i].length();
            System.out.println(numb[i]);
        }

    }
}
