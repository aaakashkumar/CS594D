/*
Given are two one-dimensional arrays A & B, which are sorted in ascending order.
Write a Java program to merge them into single sorted array C that contains every item from arrays A & B, in ascending order.
*/

import java.util.Scanner;

class week3_23
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr1, arr2, finalArray;
        int arraySize1, arraySize2;

        System.out.println("Enter the size of the first array:");
        arraySize1 = cin.nextInt();

        arr1 = new int[arraySize1];
        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < arraySize1; ++i)
        {
            arr1[i] = cin.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        arraySize2 = cin.nextInt();

        arr2 = new int[arraySize2];
        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < arraySize2; ++i)
        {
            arr2[i] = cin.nextInt();
        }

        finalArray = new int[arraySize1 + arraySize2];
        sortedMerge(arr1, arr2, arraySize1, arraySize2, finalArray);
        printArray(finalArray, arraySize1 + arraySize2);
    }

    static void sortedMerge(int[] arr1, int[] arr2, int arraySize1, int arraySize2, int[] finalArray)
    {
        int finalSize = arraySize1 + arraySize2;
        int i = 0, j = 0, k = 0;

        while (true)
        {
            if (arr1[i] <= arr2[j])
            {
                finalArray[k++] = arr1[i++];
            }

            else if (arr1[i] > arr2[j])
            {
                finalArray[k++] = arr2[j++];
            }

            if (i == arraySize1 || j == arraySize2)
            {
                break;
            }
        }

        if (i >= arraySize1 && j < arraySize2)
        {
            while (j < arraySize2)
                finalArray[k++] = arr2[j++];
        }

        if(j >= arraySize2 && i < arraySize1)
        {
            while (i < arraySize1)
                finalArray[k++] = arr1[i++];
        }
    }

    static void printArray(int[] arr, int arraySize)
    {
        for (int i = 0; i < arraySize; ++i)
        {
            System.out.println(arr[i] + "\t");
        }
    }
}
