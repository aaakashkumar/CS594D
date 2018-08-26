// Write a Java program to merge two float arrays.

import java.util.Scanner;

class week3_17
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        float[] arr1, arr2, finalArray;
        int arraySize1, arraySize2;

        System.out.println("Enter the size of the first array:");
        arraySize1 = cin.nextInt();

        arr1 = new float[arraySize1];
        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < arraySize1; ++i)
        {
            arr1[i] = cin.nextFloat();
        }

        System.out.println("Enter the size of the second array:");
        arraySize2 = cin.nextInt();

        arr2 = new float[arraySize2];
        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < arraySize2; ++i)
        {
            arr2[i] = cin.nextFloat();
        }

        finalArray = new float[arraySize1 + arraySize2];
        for (int i = 0; i < arraySize1; ++i)
        {
            finalArray[i] = arr1[i];
        }
        for (int i = arraySize1, j = 0; i < (arraySize1 + arraySize2); ++i, ++j)
        {
            finalArray[i] = arr2[j];
        }

        System.out.println("Array 1:");
        printArray(arr1, arraySize1);
        System.out.println("Array 2:");
        printArray(arr2, arraySize2);
        System.out.println("Merged Array:");
        printArray(finalArray, (arraySize1 + arraySize2));
    }

    static void printArray(float arr[], int arraySize)
    {
        for (int i = 0; i < arraySize; ++i)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
