package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filepath = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(filepath);

        int item;

        while (inputStream.available() > 0) {
            item = inputStream.read();

            if (!list.contains(item)) {
                list.add(item);
            }
        }

        inputStream.close();

        Collections.sort(list);

        for (Integer i : list)
        {
            System.out.print(i + " ");
        }
    }
}
