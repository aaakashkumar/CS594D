// Write a Java program to calculate Sum & Average of an integer array.

import java.util.Scanner;

class week3_1
{
    public static void main(String[] args)
    {
        int arraySize;
        System.out.println("Enter the number of elements:");
        Scanner cin = new Scanner(System.in);
        arraySize = cin.nextInt();

        int[] arr = new int[arraySize];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
        }

        ArrayOperations obj = new ArrayOperations(arr, arraySize);

        System.out.println("The sum of the elements of the array is " + obj.sumOfElements());
        System.out.println("The average of the elements of the array is " + obj.averageOfElements());
    }
}

class ArrayOperations
{
    int[] arr;
    int arraySize, elementsSum;

    ArrayOperations(int[] arr, int arraySize)
    {
        this.arr = arr;
        this.arraySize = arraySize;
        elementsSum = sumOfElements();
    }

    int sumOfElements()
    {
        int sum = 0;
        for (int i = 0; i < arraySize; ++i)
        {
            sum += arr[i];
        }
        return sum;
    }

    int averageOfElements()
    {
        return elementsSum / arraySize;
    }
}
