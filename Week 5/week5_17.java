// Write a program that reads ten integers and displays them in the reverse of the order in which they were read.

import java.util.Scanner;

class week5_17
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; ++i)
        {
            numbers[i] = cin.nextInt();
        }

        System.out.println("Reverse order:");
        for (int i = 9; i >= 0; --i)
        {
            System.out.print(numbers[i] + "\t");
        }
    }
}
