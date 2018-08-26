// Write a Java program to check whether a number is prime or not.

import java.util.Scanner;

class week2_15
{
    public static void main(String[] args)
    {
        int number;

        System.out.println("Enter the number:");

        Scanner cin = new Scanner(System.in);
        number = cin.nextInt();

        if(AKSPrimalityTest(number))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }

    static boolean AKSPrimalityTest(int number)
    {
        if(number <= 1)
            return false;
        if(number <= 3)
            return true;
        if(number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5, w = 2; i * i <= number; i += w, w = 6 - w)
        {
            if(number % i == 0)
                return false;
        }

        return  true;
    }
}
