// Write a Java program for Fibonacci series.

import java.util.Scanner;

class week2_3
{
    public static void main(String[] args)
    {
        int n;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the range:");
        n = cin.nextInt();

        printFibonacci(n);
    }

    static void printFibonacci(int range)
    {
        int a = 0, b = 1, temp;

        System.out.print(a + "\t" + b + "\t");
        for (int i = 2; i < range; ++i)
        {
            temp = b;
            b = a + b;
            a = temp;

            System.out.print(b + "\t");
        }
    }
}
