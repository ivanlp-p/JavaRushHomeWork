package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] a;
        a = new int[5];

        for (int i=0;i<5;++i)
        {
            a[i] = Integer.parseInt(reader.readLine());
        }

     /*   for (int i=0;i<5;++i)
        {
            if (a[i+1]<a[i])
            {
                int c = a[i];
                a[i]=a[i-1];
                a[i-1]=c;
                System.out.println(a[i]);
            }
            else System.out.println(a[i]);

        }*/

        int i,j,x;
        for (i=1;i<5;++i)
        {
            if (a[i-1]<=a[i])
                continue;
            else
            for (x=a[j=i];j>0 && a[j-1]>x;--j)
                a[j]=a[j-1];
            a[j]=x;

        }

        for(i=0;i<5;++i)
        {
            System.out.println(a[i]);
        }
        //напишите тут ваш код
    }


}
