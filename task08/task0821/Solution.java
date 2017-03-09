package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> base = new HashMap<String, String>();
        base.put("LastName1","Name20");
        base.put("LastName2","Name19");
        base.put("LastName3","Name18");
        base.put("LastName4","Name17");
        base.put("LastName5","Name16");
        base.put("LastName6","Name11");
        base.put("LastName7","Name14");
        base.put("LastName8","Name13");
        base.put("LastName9","Name12");
        base.put("LastName1","Name11");

        return base;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
