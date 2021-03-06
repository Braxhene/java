package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        //Добавляем 10 записей
        map.put("0", new Date("JUNE 1 1980"));
        map.put("1", new Date("JUNE 1 1980"));
        map.put("2", new Date("JULY 1 1980"));
        map.put("3", new Date("AUGUST 1 1980"));
        map.put("4", new Date("SEPTEMBER 1 1980"));
        map.put("5", new Date("OCTOBER 1 1980"));
        map.put("6", new Date("NOVEMBER 1 1980"));
        map.put("7", new Date("DECEMBER 1 1980"));
        map.put("8", new Date("JANUARY 1 1980"));
        map.put("9", new Date("FEBRUARY 1 1980"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        final int JUNE=5;
        final int AUGUST=7;
        Iterator<HashMap.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String,Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month >= JUNE && month <= AUGUST){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
