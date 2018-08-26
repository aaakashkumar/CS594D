// Write a Java program to check whether a number is divisible by 5 or not.

import java.util.Scanner;

class week1_14
{
    public static void main(String[] args)
    {
        int number;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the number:");
        number = cin.nextInt();

        Divisibility obj = new Divisibility();

        if (obj.isDivisible(number, 5))
            System.out.println(number + " is divisible by 5.");
        else
            System.out.println(number + " is not divisible by 5.");

    }
}

class Divisibility
{
    boolean isDivisible(int number, int divisor)
    {
        return (number % divisor == 0);
    }
}
