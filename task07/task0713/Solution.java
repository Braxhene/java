package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList();

        for (int i=0; i<20; i++)
        {
            list.add(Integer.parseInt(read.readLine()));
        }
        ArrayList<Integer> odd = new ArrayList();
        ArrayList<Integer> even = new ArrayList();
        ArrayList<Integer> other = new ArrayList();
        for (int i=0; i<list.size(); i++)
        {
            Integer x = list.get(i);
            if (x%2==0&&x%3==0){
                even.add(x);
                odd.add(x);
            } else if (x%3==0){
                odd.add(x);
            }else if (x%2==0){
                even.add(x);
            } else other.add(x);
        }
        printList(odd);
        printList(even);
        printList(other);
    }
    public static void printList(List<Integer> list) {
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));

        }
    }
}
