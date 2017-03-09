package com.javarush.task.task08.task0819;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> hashSet = new HashSet<Cat>();
        for (int i=0;i<3;i++){
            hashSet.add(new Cat());
        }
        return hashSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat m:cats){
            System.out.println(m);
        }
    }

    public static class Cat{

        public Cat(){
            super();
        }
    }
    // step 1 - пункт 1
}
