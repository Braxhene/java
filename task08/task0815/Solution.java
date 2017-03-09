package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Антон");
        map.put("2", "1");
        map.put("3", "2");
        map.put("4", "3");
        map.put("5", "4");
        map.put("61", "Антон");
        map.put("11", "5");
        map.put("8", "6");
        map.put("9", "7");
        map.put("10", "8");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countN=0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String name1=pair.getValue();
            if (name.equals(name1)) {
                countN++;
            }
        }
        return countN;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int countFN=0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String lastname1=pair.getKey();
            if (lastName.equals(lastname1)) {
                countFN++;
            }
        }
        return countFN;
    }

    public static void main(String[] args) {

    }
}
