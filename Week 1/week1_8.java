// Write a Java Program to check if a number is Positive or Negative

import java.util.Scanner;

class week1_8
{
  public static void main(String[] args)
  {
    int number;

    Scanner cin = new Scanner(System.in);

    System.out.println("Enter a number:");
    number = cin.nextInt();

    System.out.println("The number you've enter is " + getNumberSign(number));
  }

  static String getNumberSign(int number)
  {
    if (number >= 0)
      return ("Positive");
    else
      return ("Negative");
  }
}
