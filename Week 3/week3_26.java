// Write a Java program to show constructor overloading

import java.lang.Math;

class Area
{
    double area;

    Area(double side)
    {
        area = Math.pow(side, 2);
    }

    Area(double length, double breadth)
    {
        area = length * breadth;
    }

    void displayArea()
    {
        System.out.println("The area is " + area);
    }
}

class week3_26
{
    public static void main(String[] args) 
    {
        Area square = new Area(3);
        square.displayArea();

        Area rectangle = new Area(3, 4);
        rectangle.displayArea();
    }
}