// Write a Java program to swap two numbers

import java.util.Scanner;

class week1_10
{
  static int num1, num2;

  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);

    System.out.println("Enter two numbers to be swapped:");
    num1 = cin.nextInt();
    num2 = cin.nextInt();

    System.out.println("Before swapping: A = " + num1 + " and B = " + num2 + ".");
    Swap();
    System.out.println("After swapping: A = " + num1 + " and B = " + num2 + ".");
  }

  static void Swap()
  {
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;
  }
}
