// Write a Java program to print all multiple of 10 between a given interval.

import java.util.Scanner;

class week2_8
{
    public static void main(String[] args)
    {
        int upperInterval, lowerInterval;

        System.out.println("Enter the interval:");
        Scanner cin = new Scanner(System.in);
        System.out.print("Lower: ");
        lowerInterval = cin.nextInt();
        System.out.print("Upper: ");
        upperInterval = cin.nextInt();

        System.out.println("The multiples of 10 between " + lowerInterval + " and " + upperInterval + " are:");
        printMultiples(10, lowerInterval, upperInterval);
    }

    static void printMultiples(int number, int lowerInterval, int upperInterval)
    {
        int start, end;

        if(lowerInterval / 10 == 0)
            start = lowerInterval / 10;
        else
            start = lowerInterval / 10 + 1;

        end = upperInterval / 10;

        for (int i = start; i <= end; ++i)
        {
            System.out.print((10 * i) + "\t");
        }
    }
}
