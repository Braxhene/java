package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(read.readLine());
        }

        String brain;
        for (int i = 0; i < 13; i++) {
            int size = list.size();
            brain=list.get(size-1);
            list.remove(size-1);
            list.add(0, brain);
        }

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}