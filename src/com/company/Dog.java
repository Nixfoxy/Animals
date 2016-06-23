package com.company;


public class Dog {

    private String name;
    private double years;
    private int size;

    public String getName()
    {
     return name;
    }
    public double getYears()
    {
        return years;
    }
    public int getSize ()
    {
        return size;
    }

    void setName(String dogName)
    {
        name = dogName;
    }

    void setYears(int dogyears)
    {
        years = dogyears;
    }

    void setSize(int dogSize)
    {
        size = dogSize;
    }

    void bark(int barks) {
        while (barks > 0) {
            if (getYears() >= 1) {
                if (getSize() >= 50) {
                    System.out.println("Уфф!");
                } else if (getSize() >= 30) {
                    System.out.println("Гав!");
                } else {
                    System.out.println("Тяв!");
                }
            } else {
                if (getSize() >= 30) {
                    System.out.println("Уфф!");
                } else {
                    System.out.println("Тяв!");
                }
            } barks= barks - 1;
        }
    }
}
