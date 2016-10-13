package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;
        int child;

        public Human(String name, int age, boolean sex, Human father, Human mother, int child)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
            this.child = child;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, int child)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.child = child;
        }

        public Human(String name, int age, boolean sex, Human father)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
        }

        public Human(String name, int age, boolean sex, Human father, Human mother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, int age, boolean sex, Human father, int child)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.child = child;
        }

        public Human(Human father, Human mother, int child)
        {
            this.father = father;
            this.mother = mother;
            this.child = child;
        }

        public Human(String name, int age, Human father, Human mother)
        {
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(Human mother, String name, int age)
        {
            this.mother = mother;
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int child)
        {
            this.name = name;
            this.age = age;
            this.child = child;
        }
    }
}
