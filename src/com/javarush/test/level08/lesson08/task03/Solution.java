package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("1", "Ла");
        map.put("2", "Лу");
        map.put("3", "Лпа");
        map.put("4", "Лке");
        map.put("5", "Лсми");
        map.put("6", "Лва");
        map.put("7", "Лсми");
        map.put("8", "Лвап");
        map.put("9", "Лкуе");
        map.put("10", "Лс");

        return (HashMap<String, String>)map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String firstName = pair.getValue();
            if (firstName.equals(name))
                count++;

        }

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String secName = pair.getKey();
            if (secName.equals(lastName))
                count++;

        }

        return count;
    }
}
