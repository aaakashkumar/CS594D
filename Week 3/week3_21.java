// Write a Java program to find duplicate elements in a 1D array and find their frequency of occurrence.

import java.util.*;
import java.lang.Math;

class week3_21
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr;
        int arraySize;

        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
        }

        ArrayOperations obj = new ArrayOperations(arr, arraySize);

        obj.findDuplicates();
        obj.printDuplicateFrequencies();
    }
}

class ArrayOperations
{
    int[] arr, tempArr, duplicates, duplicateFrequency;
    int arraySize, duplicateCount, duplicateSize;

    ArrayOperations(int[] arr, int arraySize)
    {
        this.arr = arr;
        this.arraySize = arraySize;
    }

    void printArray(int[] arr, int arraySize)
    {
        for (int i = 0; i < arraySize; ++i)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    void findDuplicates()
    {
        duplicateCount = 0;
        duplicateSize = 0;
        duplicates = new int[duplicateSize];
        duplicateFrequency = new int[duplicateSize];
        tempArr = arr.clone();
        Arrays.sort(tempArr);

        for (int i = 0; i < arraySize; ++i)
        {
            for (int j = i + 1; j < arraySize; ++j)
            {
                if (tempArr[j] == tempArr[i])
                {
                    ++duplicateCount;
                }
                else
                {
                    if (duplicateCount > 0)
                    {
                        duplicates = Arrays.copyOf(duplicates, ++duplicateSize);
                        duplicateFrequency = Arrays.copyOf(duplicateFrequency, duplicateSize);
                        duplicates[duplicateSize - 1] = tempArr[i];
                        duplicateFrequency[duplicateSize - 1] = duplicateCount + 1;
                    }

                    duplicateCount = 0;
                    i = j - 1;
                    break;
                }
            }
        }

        System.out.println("The numbers which have a duplicate are:");
        printArray(duplicates, duplicateSize);
    }

    void printDuplicateFrequencies()
    {
        for (int i = 0; i < duplicateSize; ++i)
        {
            System.out.println("Frequency(" + duplicates[i]  + ") = " + duplicateFrequency[i]);
        }
    }
}
