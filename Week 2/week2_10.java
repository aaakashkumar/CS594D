//  Write a Java program to find HCF of two Numbers.

import java.util.Scanner;

class NumberOperations
{
    int calculateLCM(int number1, int number2)
    {
        return (number1 * number2 / (calculateHCF(number1, number2)));
    }

    int calculateHCF(int number1, int number2)
    {
        int temp;

        // Euclidean Algorithm for finding GCD
        while(number2 != 0)
        {
            temp    = number2;
            number2 = number2 % number1;
            number1 = temp;
        }

        return number1;
    }
}

class week2_10
{
    public static void main(String[] args)
    {
        int number1, number2;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = cin.nextInt();
        System.out.println("Enter the second number:");
        number2 = cin.nextInt();

        NumberOperations obj = new NumberOperations();

        System.out.println("The HCF of " + number1 + " and " + number2 + " is " + obj.calculateHCF(number1, number2));
        System.out.println("The LCM of " + number1 + " and " + number2 + " is " + obj.calculateLCM(number1, number2));
    }
}
