package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s=reader.readLine();
            if (!s.equalsIgnoreCase("End")){
                data.add(s);
            }else break;
        }
        for (int i=0; i<data.size(); i++){
            System.out.println(data.get(i));
        }
    }
}