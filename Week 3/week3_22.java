// Write a Java program to print every alternate number of a given array.

import java.util.Scanner;

class week3_22
{
    public static void main(String[] args)
    {
        int[] arr;
        int arraySize;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
        }

        System.out.println("The array is:");
        printArray(arr, arraySize, false);

        System.out.println("Alternate numbers of the array are:");
        printArray(arr, arraySize, true);
    }

    static void printArray(int[] arr, int arraySize, boolean printAlternateNumbers)
    {
        for (int i = 0; i < arraySize; ++i)
        {
            System.out.println(arr[i] + "\t");

            if(printAlternateNumbers)
                ++i;
        }
    }
}
