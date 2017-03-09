package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++){
            arrayList.add(read.readLine());
        }
        for (int i=0; i<arrayList.size(); i++){
            if (arrayList.get(i).length()>5){
                System.out.println(arrayList.get(i));
            }
        }
    }
}
