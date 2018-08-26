// Write a Java program to find the sum of even numbers in an integer array.

import java.util.Scanner;

class week3_7
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr;
        int arraySize, sum = 0;

        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }

        System.out.println("The sum of even numbers in the array is " + sum);

    }
}
