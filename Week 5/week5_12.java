/*
Write a program which will accept an integer from the user and pass the value to a method called
PrintNumberInWord that will print "ONE", "TWO",... , "NINE", "ZERO" if the integer variable "number"
is 1, 2,... , 9, or 0, respectively.
*/

import java.util.Scanner;

class week5_12
{
    public static void main(String[] args)
    {
        int number;

        Scanner cin = new Scanner(System.in);

        System.out.print("Enter a number (0 - 9): ");
        number = cin.nextInt();
        while(number < 0 || number > 9)
        {
            System.out.println("Error. Number out of range 0 to 9.");
            System.out.print("Please try again: ");
            number = cin.nextInt();
        }

        PrintNumberInWord(number);
    }

    static void PrintNumberInWord(int number)
    {
        String[] arr = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

        System.out.println(arr[number]);
    }
}
