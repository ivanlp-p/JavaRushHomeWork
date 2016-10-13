package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        set.add("Л");
        set.add("Ла");
        set.add("Лб");
        set.add("Лв");
        set.add("Лг");
        set.add("Лд");
        set.add("Ле");
        set.add("Лж");
        set.add("Лз");
        set.add("Ли");
        set.add("Лк");
        set.add("Лвап");
        set.add("Лвапвап");
        set.add("Лвапвапвп");
        set.add("Лкуеку");
        set.add("Лукеавп");
        set.add("Лсми");
        set.add("Лс");
        set.add("Лавп");
        set.add("Лыва");

        return (HashSet<String>)set;

    }
}
