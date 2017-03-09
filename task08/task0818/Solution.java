package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> base = new HashMap<String, Integer>();
        for (int i=497;i<507;i++){
            base.put("Name"+i,i);
        }
        return base;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> mapCopy = new HashMap<String, Integer>(map);
        for (HashMap.Entry<String, Integer> pair : mapCopy.entrySet()){
            if (pair.getValue()<500) {
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) {

    }
}