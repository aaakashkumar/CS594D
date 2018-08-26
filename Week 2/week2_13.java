// Write a Java program to calculate the exponential of a number.

import java.util.Scanner;

class week2_13
{
    public static void main(String[] args)
    {
        int base, exponent;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the base:");
        base = cin.nextInt();

        System.out.println("Enter the exponent:");
        exponent = cin.nextInt();

        System.out.println(base + " ^ " + exponent + " = " + exp(base, exponent));
    }

    static int exp(int b, int e)
    {
        int exponential = b;
        for (int i = 1; i < e; ++i)
        {
            exponential += exponential;
        }

        return exponential;
    }
}
