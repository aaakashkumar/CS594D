// Write a Java program to display prime numbers between a given interval.

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int upper, lower;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the lower limit:");
        lower = cin.nextInt();

        System.out.println("Enter the upper limit:");
        upper = cin.nextInt();

        SieveOfEratosthenes obj = new SieveOfEratosthenes(lower, upper);

        obj.runSieveOfEratosthenes();
        obj.printArray();
    }
}

class SieveOfEratosthenes
{
    public int lower, upper;
    public int arr[];
    public boolean isPrime[];

    SieveOfEratosthenes(int lower, int upper)
    {
        this.lower = lower;
        this.upper = upper;

        isPrime = new boolean[upper + 1];
        // System.out.println(isPrime.length);
        for (int i = 0; i <= upper; ++i)
            isPrime[i] = true;

        arr = new int[upper + 1];
        for (int i = 0; i <= upper; ++i)
            arr[i] = i;
    }

    public void runSieveOfEratosthenes()
    {
        for(int p = 2; p * p <= upper; ++p)
        {
            if(isPrime[p] == true)
            {
                for(int i = p * 2; i <= upper; i += p)
                {
                    isPrime[i] = false;
                }
            }
        }
    }

    public void printArray()
    {
        for (int i = lower; i <= upper; ++i)
        {
            if(isPrime[i])
                System.out.print(arr[i] + "\t");
        }
    }
}
