package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] count = new String[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<(count.length-2);i++){
            count[i] = read.readLine();
        }

        for (int i=count.length-1;i>=0;i--){
            System.out.println(count[i]);
        }
        //напишите тут ваш код
    }
}