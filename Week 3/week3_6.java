// Write a Java program to search an element in an array.

import java.util.Scanner;

class week3_6
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr;
        int arraySize, key;

        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        key = cin.nextInt();

        linearSearch(arr, arraySize, key);
    }

    static void linearSearch(int[] arr, int arraySize, int key)
    {
        boolean found = false;
        int position;
        for (position = 0; position < arraySize; ++position)
        {
            if (arr[position] == key)
            {
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println(key + " does not exist in the array.");
        else
            System.out.println(key + " found at position " + (position+1) + ".");
    }
}
