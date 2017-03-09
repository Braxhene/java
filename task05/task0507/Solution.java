package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum=0;
        int i, j=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String text = reader.readLine();
            int n = Integer.parseInt(text);
            if (n != -1)
            {
                sum += n;
                j++;
            } else break;
        }
        System.out.println((double)sum/j);
    }
}

