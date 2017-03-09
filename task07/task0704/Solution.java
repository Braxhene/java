package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrint = new int[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<arrint.length;i++){
            String text = read.readLine();
            arrint[i]=Integer.parseInt(text);
        }

        //Распологаем элементы массива в обратном порядке.
        for (int i=arrint.length-1; i>=0; i--){
            System.out.println(arrint[i]);
        }
    }
}

