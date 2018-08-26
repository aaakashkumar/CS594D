// Write a Java program to enter n elements in an array and find smallest number among them.

import java.util.Scanner;

class week3_10
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
        }

        System.out.println("The smallest number in the array is " + arrayMinimum(arr, arraySize));
    }

    static int arrayMinimum(int[] arr, int arraySize)
    {
        int min = arr[0];
        for (int i = 1; i < arraySize; ++i)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }
}
