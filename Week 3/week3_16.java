// Write a Java program which counts the non-zero elements in an integer array.

import java.util.Scanner;

class week3_16
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr;
        int arraySize, nonZeroCount = 0;

        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
            if (arr[i] != 0)
                ++nonZeroCount;
        }

        System.out.println("There are " + nonZeroCount + " non zero numbers in the array.");
    }
}
