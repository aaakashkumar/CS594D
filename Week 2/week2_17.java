// Write a Java program to find median of a set of numbers.

import java.util.*;

class week2_17
{
    public static void main(String[] args)
    {
        int arraySize;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        arraySize = cin.nextInt();

        System.out.println("Enter the elements:");
        int set[] = new int[arraySize];
        for (int i = 0; i < arraySize; ++i)
        {
            set[i] = cin.nextInt();
        }

        System.out.print("The median of ");
        printArray(set, arraySize);
        System.out.println(" is " + findMedian(set, arraySize));
    }

    public static void printArray(int a[], int n)
    {
        System.out.print("[");
        for (int i = 0; i < n; ++i)
        {
            if(i != n - 1)
                System.out.print(a[i] + ", ");
            else
                System.out.println(a[i] + "]");
        }
    }

    public static double findMedian(int a[], int n)
    {
        Arrays.sort(a);

        if (n % 2 != 0)
            return (double)a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

}
