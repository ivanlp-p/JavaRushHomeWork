package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        return new ArrayList();
        //напишите тут ваш код
      /*  Date currentTime1 = new Date();

       ArrayList list1 = new ArrayList();
        for(int i=0; i<10000;i++)
            list1.get(i);

        Date newTime1 = new Date();
        long msDelay1 = newTime1.getTime() - currentTime1.getTime();

        Date currentTime2 = new Date();
        LinkedList list2 = new LinkedList();
        for(int i=0; i<10000;i++)
            list2.get(i);

        Date newTime2 = new Date();
        long msDelay2 = newTime2.getTime() - currentTime2.getTime();

        if (msDelay1<msDelay2)
            return list1;
        else
            return list2;*/



    }

    public static List  getListForSet()
    {
        return new ArrayList();
        //напишите тут ваш код
  /*      Date currentTime1 = new Date();

        ArrayList list1 = new ArrayList();
        for(int i=0; i<10000;i++)
            list1.set(i,i);

        Date newTime1 = new Date();
        long msDelay1 = newTime1.getTime() - currentTime1.getTime();

        Date currentTime2 = new Date();
        LinkedList list2 = new LinkedList();
        for(int i=0; i<10000;i++)
            list2.set(i,i);

        Date newTime2 = new Date();
        long msDelay2 = newTime2.getTime() - currentTime2.getTime();

        if (msDelay1<msDelay2)
            return list1;
        else
            return list2;*/

    }

    public static List  getListForAddOrInsert()
    {

            return new LinkedList();
        //напишите тут ваш код
/*        Date currentTime1 = new Date();

        ArrayList list1 = new ArrayList();
        for(int i=0; i<10000;i++)
            list1.add(i);

        Date newTime1 = new Date();
        long msDelay1 = newTime1.getTime() - currentTime1.getTime();

        Date currentTime2 = new Date();
        LinkedList list2 = new LinkedList();
        for(int i=0; i<10000;i++)
            list2.add(i);

        Date newTime2 = new Date();
        long msDelay2 = newTime2.getTime() - currentTime2.getTime();

        if (msDelay1<msDelay2)
            return list1;
        else
            return list2;*/

    }

    public static List  getListForRemove()
    {
        return new LinkedList();
        //напишите тут ваш код
/*
        Date currentTime1 = new Date();

        ArrayList list1 = new ArrayList();
        for(int i=0; i<10000;i++)
            list1.remove(0);

        Date newTime1 = new Date();
        long msDelay1 = newTime1.getTime() - currentTime1.getTime();

        Date currentTime2 = new Date();
        LinkedList list2 = new LinkedList();
        for(int i=0; i<10000;i++)
            list2.remove(0);

        Date newTime2 = new Date();
        long msDelay2 = newTime2.getTime() - currentTime2.getTime();

        if (msDelay1<msDelay2)
            return list1;
        else
            return list2;
*/

    }
}
