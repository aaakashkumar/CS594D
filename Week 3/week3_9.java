// Reverse the elements in an array of integers without using a second array.

import java.util.Scanner;

class week3_9
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

        ArrayOperations obj = new ArrayOperations(arr, arraySize);

        System.out.println("Array before reversing:");
        obj.printArray();

        obj.reverseArray();

        System.out.println("Array after reversing");
        obj.printArray();
    }
}

class ArrayOperations
{
    int[] arr;
    int arraySize;

    ArrayOperations(int[] arr, int arraySize)
    {
        this.arr = arr;
        this.arraySize = arraySize;
    }

    void printArray()
    {
        for (int i = 0; i < arraySize; ++i)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    void reverseArray()
    {
        int temp;
        for (int i = 0, j = (arraySize - 1); i <= ((arraySize / 2) - 1); ++i, --j)
        {
            temp   = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
