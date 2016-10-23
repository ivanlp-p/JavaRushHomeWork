package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filepath1 = reader.readLine();
        String filepath2 = reader.readLine();
        String filepath3 = reader.readLine();


        reader.close();

        FileInputStream inputStream =new FileInputStream(filepath1);
        FileOutputStream outputStream1 = new FileOutputStream(filepath2);
        FileOutputStream outputStream2 = new FileOutputStream(filepath3);

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            if (buffer.length % 2 == 0) {
                outputStream1.write(buffer, 0, count/2);
                outputStream2.write(buffer, count/2, count/2);
            } else {
                outputStream1.write(buffer, 0, count/2 + 1);
                outputStream2.write(buffer, count/2 + 1, count/2);
            }
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
