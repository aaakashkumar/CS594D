// Write a Java program to find area and perimeter of a circle

import java.util.Scanner;
import java.lang.Math.*;

class week1_6
{
  public static void main(String[] args) {
    double radius;

    Scanner cin = new Scanner(System.in);

    System.out.println("Enter the radius of the circle: ");
    radius = cin.nextDouble();

    System.out.println("The area of the circle is " + getCircleArea(radius));
    System.out.println("The perimeter of the circle is " + getCirclePerimeter(radius));
  }

  static double getCircleArea(double radius)
  {
    return (Math.PI * Math.pow(radius, 2));
  }

  static double getCirclePerimeter(double radius)
  {
    return (2 * Math.PI * radius);
  }
}
