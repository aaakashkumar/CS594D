// Write a Java program to count the number of digits of an integer.

import java.util.Scanner;

class week2_12
{
    public static void main(String[] args)
    {
        int number;

        System.out.println("Enter the number:");
        Scanner cin = new Scanner(System.in);
        number = cin.nextInt();

        System.out.println("The number of digits in " + number + " is " + countDigits(number));
    }

    static int countDigits(int number)
    {
        int numberOfDigits = 0;

        while(number > 0)
        {
            number /= 10;
            ++numberOfDigits;
        }

        return  numberOfDigits;
    }
}
