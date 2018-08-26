// Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;

class week2_14
{
    public static void main(String[] args)
    {
        int number;

        System.out.println("Enter the number:");

        Scanner cin = new Scanner(System.in);
        number = cin.nextInt();

        if(isPalindrome(number))
            System.out.println(number + " is a palindrome number.");
        else
            System.out.println(number + " is not a palindrome number.");
    }

    static boolean isPalindrome(int number)
    {
        if (reverseNumber(number) == number)
            return true;
        else
            return false;
    }

    static int reverseNumber(int a)
    {
        int b, c = 0;

        do
        {
            b = a % 10;
            c = c * 10 + b;
            a = a / 10;
        }
        while (a != 0);

        return  c;
    }
}
