package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Double> list = new ArrayList<>();
        ArrayList<String > listInt = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filepath1 = reader.readLine();
        String filepath2 = reader.readLine();

        reader.close();

        FileInputStream file1 = new FileInputStream(filepath1);

        Scanner sc = new Scanner(file1);
        sc.useLocale(new Locale("en", "en"));

        while (sc.hasNextDouble()) {
            list.add(sc.nextDouble());
        }

        for (int i = 0; i < list.size(); i++) {
            int a = (int) Math.round(list.get(i));
            if (i != list.size() - 1) {
                listInt.add(a + " ");
            } else {
                listInt.add(a + "");
            }
        }

        FileOutputStream file2 = new FileOutputStream(filepath2);

        for (String i : listInt) {
            file2.write(i.getBytes());
        }

        file1.close();
        file2.close();
        sc.close();

    }
}
