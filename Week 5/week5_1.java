// Create a "circle" class & a "point" class. 
// The coordinates of the circle are given and used within the 
// "circle" class as object of the "point" class. 
// Display the area of circle.

import java.util.Scanner;
import java.math.*;

class Point
{
    double x, y;

    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}

class Circle
{
    double r, area;

    public double getArea(Point p1, Point p2)
    {
        r = (Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2))) / 2;
        return Math.PI * Math.pow(r, 2);
    }
}

class week5_1
{
    public static void main(String[] args) 
    {
        double pointx1, pointx2, pointy1, pointy2;

        Scanner cin = new Scanner(System.in);    

        System.out.println("Enter the coordinates of first point:");
        System.out.print("x: ");
        pointx1 = cin.nextDouble();
        System.out.print("y: ");
        pointy1 = cin.nextDouble();

        System.out.println("Enter the coordinates of second point:");
        System.out.print("x: ");
        pointx2 = cin.nextDouble();
        System.out.print("y: ");
        pointy2 = cin.nextDouble();

        Point p1 = new Point(pointx1, pointy1);
        Point p2 = new Point(pointx2, pointy2);

        Circle C = new Circle();

        System.out.println("The area of the circle with the given endpoints of the diameter is " + C.getArea(p1, p2));
    }
}

