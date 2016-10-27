package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        String filepath = args[0];

        FileInputStream inputStream = new FileInputStream(filepath);

        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }

        inputStream.close();

        int countSp = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(32)) {
                countSp++;
            }
        }
        String result = new DecimalFormat("#0.00").format(((double)countSp / list.size() * 100));
        System.out.println(result);
    }
}
