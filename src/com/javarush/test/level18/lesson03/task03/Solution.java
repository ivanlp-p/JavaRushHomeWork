package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> byteList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filepath = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(filepath);

        while (inputStream.available() > 0) {

            list.add(inputStream.read());
        }

        inputStream.close();

        int maxCount = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) == list.get(j)){
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                byteList.clear();
                byteList.add(list.get(i));
            } else if (count == maxCount) {
                byteList.add(list.get(i));
            }
        }

        for (Integer name : byteList)
        {
            System.out.print(name + " ");
        }
    }
}
