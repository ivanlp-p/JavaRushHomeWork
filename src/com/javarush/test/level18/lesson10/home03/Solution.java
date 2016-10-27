package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filepath1 = reader.readLine();
        String filepath2 = reader.readLine();
        String filepath3 = reader.readLine();

        reader.close();

        FileInputStream file1 = new FileInputStream(filepath2);
        FileOutputStream file2 = new FileOutputStream(filepath1);

        if (file1.available() > 0) {
            byte[] buffer = new byte[file1.available()];
            file2.write(buffer, 0, file1.read(buffer));
        }

        file1.close();
        file2.close();

        FileInputStream file3 = new FileInputStream(filepath3);
        FileOutputStream file1out = new FileOutputStream(filepath1, true);

        if (file3.available() > 0) {
            byte[] buffer = new byte[file3.available()];
            file1out.write(buffer, 0, file3.read(buffer));
        }

        file3.close();
        file1out.close();

    }
}
