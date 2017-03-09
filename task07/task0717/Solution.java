package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            list.add(read.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String z : result){
            System.out.println(z);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i=0; i<list.size(); i+=2){
            list.add(i,list.get(i));
        }

        return list;
    }
}
