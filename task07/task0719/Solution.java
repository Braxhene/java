package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ArrInt = new ArrayList<>();
        for (int i=0; i<10; i++){
            ArrInt.add(Integer.parseInt(reader.readLine()));
        }
        int len = ArrInt.size();

        for (int j=len-1; j>=0; j--){
            System.out.println(ArrInt.get(j));
        }


        //напишите тут ваш код
    }
}
