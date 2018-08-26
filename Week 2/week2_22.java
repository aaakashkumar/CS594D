// Write a Java program to check whether a given number is Armstrong Number or not.

import java.util.Scanner;
import java.lang.Math.*;

class week2_22
{
    public static void main(String[] args)
    {
        int number;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = cin.nextInt();

        if(isArmstrongNumber(number))
            System.out.println(number + " is an armstrong number.");
        else
            System.out.println(number + " is not an armstrong number.");
    }

    public static boolean isArmstrongNumber(int number)
    {
        int result = 0, remainder, originalNumber = number, numberLength = 0;

        while(number != 0)
        {
            number /= 10;
            ++numberLength;
        }

        number = originalNumber;

        while(number != 0)
        {
            remainder = number % 10;
            result += Math.pow(remainder, numberLength);
            number /= 10;
        }

        if (originalNumber == result)
            return true;
        else
            return false;
    }
}
