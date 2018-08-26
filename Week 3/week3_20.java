// Write a Java program to subtract two matrices.

import java.util.Scanner;

class week3_20
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr1, arr2, finalArray;
        int arraySize;

        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr1 = new int[arraySize];
        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr1[i] = cin.nextInt();
        }

        arr2 = new int[arraySize];
        finalArray = new int[arraySize];
        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr2[i] = cin.nextInt();
            finalArray[i] = arr1[i] - arr2[i];
        }

        System.out.println("A = ");
        printArray(arr1, arraySize);
        System.out.println("B = ");
        printArray(arr2, arraySize);
        System.out.println("A - B = ");
        printArray(finalArray, arraySize);
    }

    static void printArray(int arr[], int arraySize)
    {
        for (int i = 0; i < arraySize; ++i)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
