package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Ivan on 16.03.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(Integer i)
    {
        super(i);
    }

    public SubSolution(String s)
    {
        super(s);
    }

    public SubSolution(Object o)
    {
        super(o);
    }

    protected SubSolution(Integer i, Boolean b)
    {
        super(i, b);
    }

    protected SubSolution(Integer i, String s)
    {
        super(i, s);
    }

    protected SubSolution(Integer i, Object o)
    {
        super(i, o);
    }

    SubSolution(String s, Integer i)
    {
        super(s, i);
    }

    SubSolution(String s, Boolean b)
    {
        super(s, b);
    }

    SubSolution(String s, Object o)
    {
        super(s, o);
    }

    private SubSolution(String b, Double d)
    {
        super(b, d);
    }

    private SubSolution(Boolean b)
    {
        super(b);
    }

    private SubSolution(Short h)
    {
        super(h);
    }
}
