package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] listAll = new ArrayList[3];

        /*ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        list1.add("1");
        list2.add("2");
        list3.add("3");

        listAll[0] = list1;
        listAll[1] = list2;
        listAll[2] = list3;*/
        listAll[0] = new ArrayList<>();
        listAll[1] = new ArrayList<>();
        listAll[2] = new ArrayList<>();
        listAll[0].add("ABC");
        listAll[0].add("CBA");
        listAll[1].add("DEF");
        listAll[2].add("GHI");

        return listAll;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}