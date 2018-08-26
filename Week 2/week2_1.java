// Write a Java program to check whether a number is Buzz or not.

import java.util.Scanner;

class week2_1
{
    public static void main(String[] args)
    {
        int number;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the number:");
        number = cin.nextInt();

        if (isBuzz(number))
            System.out.println(number + " is a Buzz number.");
        else
            System.out.println(number + " is not a Buzz number.");
    }

    static boolean isBuzz(int number)
    {
        if(number % 10 == 7 || number % 7 == 0)
            return true;
        else
            return false;
    }
}
