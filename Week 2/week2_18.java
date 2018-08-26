/*
Write a program to compute the value of Euler’s number that is used as the base of natural logarithms.
Use the following formula.
e= 1+ 1/1! +1 /2! + 1/3!+................ 1/n!
*/

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int range;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the range:");
        range = cin.nextInt();

        System.out.println("The sum of the series 1 + 1/2! + 1/3! + ... + 1/" + range + "! is " + calculateEuler(range));
    }

    static double calculateEuler(int range)
    {
        double e = 1.0;
        for (int i = 1; i <= range; ++i)
        {
            e += 1.0 / (double) factorial(i);
        }

        return  (double) e;
    }

    public static long factorial(int number)
    {
        long result = 1;

        for (int factor = 2; factor <= number; factor++)
        {
            result *= factor;
        }

        return result;
    }
}
