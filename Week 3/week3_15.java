// Write a Java program to find second highest element of an array.

import java.util.Scanner;

class week3_15
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr;
        int arraySize, primeCount = 0;

        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
        }

        // Run bubble sort twice
        for (int i = 0; i < 2; ++i)
        {
            for (int j = i; j < arraySize; ++j)
            {
                if(arr[j] > arr[j + 1])
                {
                    arr[j]     = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j]     = arr[j] - arr[j + 1];
                }
            }
        }

        System.out.println("The second largest number in the array is " + arr[arraySize - 2]);
    }
}
