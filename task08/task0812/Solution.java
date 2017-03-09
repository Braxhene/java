package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int count=1, max=1;
        ArrayList<Integer> base = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++){
            base.add(Integer.parseInt(read.readLine()));
        }
        for (int i=0; i<base.size()-1;i++)
        {
            if (base.get(i).equals(base.get(i + 1)))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);
    }
}