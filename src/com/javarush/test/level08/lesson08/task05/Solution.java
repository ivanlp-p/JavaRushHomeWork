package com.javarush.test.level08.lesson08.task05;


import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
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

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String,String> element : copy.entrySet())
        {
            int count = 0;
            for (Map.Entry<String, String> copyElement : copy.entrySet())
            {
                if (element.getValue().equals(copyElement.getValue()))
                {
                    count++;
                }
            }
            if (count > 1)
            {
                removeItemFromMapByValue(map, element.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }


    }
}
