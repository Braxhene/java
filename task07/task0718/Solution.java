package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        int a=0; //индекс, проверяющий, чтобы длинны строк не отличались на более 1 единиц

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++){
            list.add(read.readLine());
        }
        int min = list.get(0).length();
        for (int i=0; i<list.size(); i++){
            if (min>list.get(i).length()){
                System.out.println(i);
                break;

            }else min=list.get(i).length();
        }
    }
}

