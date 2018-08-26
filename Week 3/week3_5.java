// Write a Java program to find the range of a 1D array.

import java.util.Scanner;

class Array
{
    int[] arr;
    int arraySize;

    Array(int[] arr, int arraySize)
    {
        this.arr = arr;
        this.arraySize = arraySize;
    }

    int arrayMinimum()
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

    int arrayMaximum()
    {
        int max = arr[0];
        for (int i = 1; i < arraySize; ++i)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }
}

class week3_5
{
    public static void main(String[] args)
    {
        int[] arr;
        int arraySize;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
        }

        Array obj = new Array(arr, arraySize);

        System.out.println("The range of the array is [" + obj.arrayMinimum() + ", " + obj.arrayMaximum() + "]");
    }
}
