package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] data={"мама","мыла","раму"};

        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<data.length; i++){
            list.add(data[i]);
            list.add("именно");
        }
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
