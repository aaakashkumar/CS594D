/*
 Define a class called circle that contains:
 • Two private instance variables: radius (of type double) and color (of type String),
 • Initialize the variables radius and color with default value of 1.0 and "red", respectively using default constructor.
 • Include a second constructor that will use the default value for color and sets the radius to the value passed as parameter.
 • Two public methods: getRadius() and getArea() for returning the radius and area of the circle
 • Invoke the above methods and constructors in the main.
*/

import java.util.Scanner;
import java.lang.Math;

class week5_11
{
    public static void main(String[] args)
    {
        double radius;
        Scanner cin = new Scanner(System.in);

        Circle obj = new Circle();
        System.out.println("Default value of radius = " + obj.getRadius());

        System.out.print("Enter new radius:");
        radius = cin.nextDouble();

        obj = new Circle(radius);

        System.out.println("New value of radius = " + obj.getRadius());
        System.out.println("Area = " + obj.getArea());
    }
}

class Circle
{
    private double radius;
    private String color;

    Circle()
    {
        color  = "red";
        radius = 1.0;
    }

    Circle(double radius)
    {
        color  = "red";
        this.radius = radius;
    }

    double getRadius()
    {
        return radius;
    }

    double getArea()
    {
        return (Math.PI * radius * radius);
    }
}
