package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<String>();
        int min=Integer.MAX_VALUE;
        int c=0;
        String a=null;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++) {
            arrayList.add(i,read.readLine());
        }
        //нахожу минимальную длинну строки
        for (int i=0; i<arrayList.size();i++){
            if(min>=arrayList.get(i).length()){
               min=arrayList.get(i).length();
            }
        }

        //по минимальному значению вывожу строку
        for (int i=0; i<arrayList.size();i++){
            if(arrayList.get(i).length()<=min){
                System.out.println(arrayList.get(i));
            }
        }

    }
}