package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> list = new LinkedList<>();

        String filepath1 = reader.readLine();
        String filepath2 = reader.readLine();

        reader.close();

        FileInputStream file1 = new FileInputStream(filepath1);
        FileInputStream file2 = new FileInputStream(filepath2);


        while (file2.available() > 0) {
            int count = file2.read();
            list.add(count);
        }

        while (file1.available() > 0) {
            int count = file1.read();
            list.add(count);
        }
        file1.close();
        file2.close();

        FileOutputStream file1out = new FileOutputStream(filepath1);
        for (int i : list) {
            file1out.write(i);
        }



        file1out.close();
    }
}
