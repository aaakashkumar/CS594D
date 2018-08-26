// Write a Java program to find maximum of three numbers

import java.util.Scanner;

class week1_9
{
  public static void main(String[] args) {
    int num1, num2, num3;

    Scanner cin = new Scanner(System.in);

    System.out.println("Enter 3 numbers:");
    num1 = cin.nextInt();
    num2 = cin.nextInt();
    num3 = cin.nextInt();

    System.out.println("The maximum of " + num1 + ", " + num2 + " and " + num3 + " is " + getMaximum(num1, num2, num3) + ".");
  }

  static int getMaximum(int num1, int num2, int num3)
  {
    int small = Integer.MIN_VALUE;

    if(num1 > small)
      small = num1;
    if(num2 > small)
      small = num2;
    if(num3 > small)
      small = num3;

    return small;
  }
}
