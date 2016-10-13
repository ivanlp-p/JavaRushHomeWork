package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> child = new ArrayList<>();

        child.add(new Human("1",true,5));
        child.add(new Human("2",false,4));
        child.add(new Human("3",true,3));


        Human f = new Human("F", true,35,child);
        Human m = new Human("M", false,30,child);

        ArrayList<Human> fa = new ArrayList<>();
        ArrayList<Human> ma = new ArrayList<>();
        fa.add(f);
        ma.add(m);

        Human gpa1 = new Human("Вова", true,50,fa);
        Human gpa2 = new Human("Андрей", true,55,ma);
        Human gma1 = new Human("Маша", false,50,fa);
        Human gma2 = new Human("Даша", false,55,ma);

        for(Human h : child)
            System.out.println(h);

        System.out.println(f);
        System.out.println(m);
        System.out.println(gpa1);
        System.out.println(gpa2);
        System.out.println(gma1);
        System.out.println(gma2);


    }

    public static class Human
    {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human parents;

        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human parents)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.parents = parents;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
