package com.company;

import java.lang.ref.Cleaner;

public final class PersonEmployee extends AbstractPerson{

    public PersonEmployee(String n)
    {
        name = n;
    }

    public String department()
    {
        String d = "1) Bosses\\n" + "2) Fitness department\n " +
                "3) Sales department\n" +
                " 4) reception\n" +
                " 5) Сleaning department";
        return d;
    }

    @Override
    public String think(){
        th = "Я сотрудник компании";
        return th;
    }

    @Override
    public String getName(int n)
    { return name;}

    public enum Position {
        Director (1, "Director"),
        Manager (2, "Sales department manager"),
        Coach (3, "Fitness coach"),
        Administrator (4, "Reception administrator"),
        Сleaner (5, "Cleaning manager");

        private String strpos;
        private int pos;

        private Position(int pos, String strpos)
        {
            this.pos = pos;
            this.strpos = strpos;
        }

        int getPos()
        {
            return pos;
        }

        String getStrpos()
        {
            return strpos;
        }
    }
}