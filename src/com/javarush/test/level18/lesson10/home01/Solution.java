package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{

        ArrayList<Integer> list = new ArrayList<>();

        String filepath = args[0];

        FileInputStream inputStream = new FileInputStream(filepath);

        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) >= 65 && list.get(i) <= 90) || (list.get(i) >= 97 && list.get(i) <= 122)) {
                count++;
            }
        }

        inputStream.close();

        System.out.println(count);
    }
}
