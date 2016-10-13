package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.util.Objects;

public class Solution {

    public Solution(Integer i)
    {
    }

    public Solution(String s)
    {
    }

    public Solution(Object o)
    {
    }

    private Solution(String b, Double d)
    {
    }

    private Solution(Boolean b)
    {
    }

    private Solution(Short h)
    {
    }

    protected Solution(Integer i, Boolean b)
    {
    }

    protected Solution(Integer i, String s)
    {
    }

    protected Solution(Integer i, Object o)
    {
    }

    Solution(String s, Integer i)
    {
    }
    Solution(String s, Boolean b)
    {
    }
    Solution(String s, Object o)
    {
    }
}

