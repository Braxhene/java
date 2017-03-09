package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa = new Human("Rafil", true, 80);
        Human newGrandpa = new Human("UnDed", true,79);
        Human newGrandma1 = new Human("Ima",false,77);
        Human newGrandma2 = new Human("Aisha", false, 78);
        Human father = new Human("Rafis",true,55,newGrandpa,newGrandma1);
        Human mother = new Human("Fairuza", false, 50, grandpa, newGrandma2);
        Human me = new Human("Marat",true,25, father, mother);
        Human myBrother = new Human("Marsell",true,25,father,mother);
        Human mySister = new Human("Alsu", false, 32,father,mother);

        System.out.println(grandpa);
        System.out.println(newGrandpa);
        System.out.println(newGrandma1);
        System.out.println(newGrandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(me);
        System.out.println(myBrother);
        System.out.println(mySister);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name,boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name,boolean sex,int age,Human father,Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















