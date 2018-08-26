// Write a Java Program to display whether a number is odd or even

import java.util.Scanner;

class week1_7
{
  public static void main(String[] args) {
    int number;

    Scanner cin = new Scanner(System.in);

    System.out.println("Enter a number:");
    number = cin.nextInt();

    System.out.println(number + " is an " + getNumberType(number) + " number.");
  }

  static String getNumberType(int number)
  {
    if(number % 2 == 0)
      return ("Even");
    else
      return ("Odd");
  }
}
