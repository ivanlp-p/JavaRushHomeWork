package com.javarush.test.level17.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = new String();
        try {
             command = reader.readLine();
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        String data[] = command.split(" ");

        if (data[0].equals("-c")) {

        } else if (data[0].equals("-u")) {
            int id = Integer.parseInt(data[1]);
            String name = data[1];
            String sex = data[2];
            DateFormat format = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);

            Date bd = null;
            try
            {
                bd = format.parse(data[3]);
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            if (sex.equals("м")) {
                allPeople.remove(id);
                allPeople.add(id, Person.createMale(name, bd));
            } else if (sex.equals("ж")) {
                allPeople.remove(id);
                allPeople.add(id, Person.createFemale(name, bd));
            }
        }

    }

    public void createPerson(String data[]) {
        String name = data[1];
        String sex = data[2];
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);

        Date bd = null;
        try
        {
            bd = format.parse(data[3]);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, bd));
        } else if (sex.equals("ж")) {
            allPeople.add(Person.createFemale(name, bd));
        }
    }
}
