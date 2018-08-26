// Write a Java program to count the prime numbers in an array.

import java.util.Scanner;

class week3_14
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[] arr;
        int arraySize, primeCount = 0;

        System.out.println("Enter the size of the array:");
        arraySize = cin.nextInt();

        arr = new int[arraySize];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; ++i)
        {
            arr[i] = cin.nextInt();
            if (AKSPrimalityTest(arr[i]) == true)
                ++primeCount;
        }

        System.out.println("There are " + primeCount + " prime numbers in the array.");
    }

    static boolean AKSPrimalityTest(int number)
    {
        if(number <= 1)
            return false;
        if(number <= 3)
            return true;
        if(number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5, w = 2; i * i <= number; i += w, w = 6 - w)
        {
            if(number % i == 0)
                return false;
        }

        return  true;
    }
}
