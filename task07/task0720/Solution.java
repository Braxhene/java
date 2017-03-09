package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> data = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i=0; i<N; i++){
            data.add(reader.readLine());
        }
        for (int j=0; j<M; j++){
            data.add(data.remove(0));
        }
        for (int k=0; k<data.size();k++){
            System.out.println(data.get(k));
        }

    }
}
