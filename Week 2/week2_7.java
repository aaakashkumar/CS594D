// Write a Java program to calculate the sum of natural numbers up to a certain range.

import java.util.Scanner;

class week2_7
{
    public static void main(String[] args)
    {
        int range;

        System.out.println("Enter the range:");
        Scanner cin = new Scanner(System.in);
        range = cin.nextInt();

        System.out.println("The sum of " + range + " natural numbers is " + sumNaturalNumber(range) + ".");
    }

    static int sumNaturalNumber(int range)
    {
        int sum = 0;

        for (int i = 1; i <= range; ++i)
        {
            sum += i;
        }

        return sum;
    }
}
