// Write a Java program to convert miles to kilometers

import java.util.Scanner;

class week1_11
{
  public static void main(String[] args)
  {
    double miles;

    Scanner cin = new Scanner(System.in);

    System.out.println("Enter distance in miles:");
    miles = cin.nextDouble();

    System.out.println(miles + " miles = " + milesToKilometers(miles) + " kilometers.");
  }

  static double milesToKilometers(double miles)
  {
    return (miles * 1.609344);
  }
}
