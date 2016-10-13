package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N;
        do
        {
            N = Integer.parseInt(reader.readLine());
        }
        while (N<=0);
        int a[]= new int[N];
        for (int i=0;i<N;i++)
        {
            a[i] = Integer.parseInt(reader.readLine());
        }
        int maximum=a[0];
        for (int i =0;i<N;i++)
        {
         if (maximum<a[i])
             maximum=a[i];
        }
        //напишите тут ваш код




        System.out.println(maximum);
    }

}
