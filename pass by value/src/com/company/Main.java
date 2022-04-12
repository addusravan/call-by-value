package com.company;


class Add
{
    int x, y;
    Add(int i, int j)
    {
        x = i;
        y = j;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Add obj = new Add(5, 10);
        // call by value (object is passed)
        change(obj);
        System.out.println("x = "+obj.x);
        System.out.println("y = "+obj.y);

    }
    public static void change(Add add)
    {
        add.x++;
        add.y++;
    }
}


