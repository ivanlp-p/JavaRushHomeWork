package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        ArrayList<Human> humans = new ArrayList<>();
        Human grandpa1 = new Human("Николай", true, 55);
        humans.add(grandpa1);
        Human grandma1 = new Human("Ольга", false, 60);
        humans.add(grandma1);
        Human grandpa2 = new Human("Андрей", true, 60);
        humans.add(grandpa2);
        Human grandma2 = new Human("Наталья", false, 55);
        humans.add(grandma2);
        Human father = new Human("Илья", true, 27, grandpa1, grandma1);
        humans.add(father);
        Human mother = new Human("Оксана", false, 33, grandpa2, grandma2);
        humans.add(mother);
        Human child1 = new Human("Алиса", false, 3, father, mother);
        humans.add(child1);
        Human child2 = new Human("Сергей", false, 4, father, mother);
        humans.add(child2);
        Human child3 = new Human("Иван", false, 5, father, mother);
        humans.add(child3);

        for(Human human : humans) {
            System.out.println(human);
        }


    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
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
