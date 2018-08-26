// Write a Java program to add two numbers

import java.util.Scanner;

class week1_2
{
    public static void main(String[] args)
    {
        int num1, num2;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = cin.nextInt();
        System.out.println("Enter the second number:");
        num2 = cin.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + add(num1, num2));
    }

    public static int add(int a, int b)
    {
        return (a + b);
    }
}