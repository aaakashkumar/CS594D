// Write a Java program to find area and perimeter of a rectangle

import java.util.Scanner;

class week1_5
{
  public static void main(String[] args) {
    double length, breadth;

    Scanner cin = new Scanner(System.in);

    System.out.println("Enter the length of the rectangle: ");
    length = cin.nextDouble();

    System.out.println("Enter the breadth of the rectangle: ");
    breadth = cin.nextDouble();

    System.out.println("The area of the rectangle is " + getRectangleArea(length, breadth));
    System.out.println("The perimeter of the rectangle is " + getRectanglePerimeter(length, breadth));
  }

  static double getRectangleArea(double length, double breadth)
  {
    return (length * breadth);
  }

  static double getRectanglePerimeter(double length, double breadth)
  {
    return (2 * (length + breadth));
  }
}
