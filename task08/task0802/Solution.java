package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("арбуз","ягода");
        data.put("банан","трава");
        data.put("вишня","ягода");
        data.put("груша","фрукт");
        data.put("дыня","овощ");
        data.put("ежевика","куст");
        data.put("жень-шень","корень");
        data.put("земляника","ягода");
        data.put("ирис","цветок");
        data.put("картофель","клубень");

        for (HashMap.Entry<String, String> pair:data.entrySet()){
            String key=pair.getKey();
            String value=pair.getValue();
            System.out.println(key+" - "+value);
        }

    }
}
