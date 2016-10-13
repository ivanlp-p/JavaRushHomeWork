package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Vandam", new Date("FEBRUARY 10 1978"));
        map.put("Shvarc", new Date("JANUARY 15 1977"));
        map.put("Kerry", new Date("JUNE 1 1980"));
        map.put("Wy", new Date("JUNE 1 1980"));
        map.put("Stet", new Date("JUNE 1 1980"));
        map.put("Chan", new Date("JUNE 1 1980"));
        map.put("A", new Date("JUNE 1 1980"));
        map.put("T", new Date("JUNE 1 1980"));
        map.put("Cris", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

        for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext();)
        {
            Map.Entry<String, Date> pair = it.next();
            int i = pair.getValue().getMonth();
            if ( i>=5 && i<=7)
                it.remove();
        }


    }
}
