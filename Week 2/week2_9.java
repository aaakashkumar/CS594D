// Write a Java program to generate multiplication table.

import java.util.Scanner;

class week2_9
{
    public static void main(String[] args)
    {
        int number;
        System.out.println("Enter the number:");
        Scanner cin = new Scanner(System.in);
        number = cin.nextInt();
        printMultiplicationTable(number);
    }

    static void printMultiplicationTable(int number)
    {
        for (int i = 1; i <= 10; ++i)
        {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
