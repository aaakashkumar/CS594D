// Write a Java program to read two integer values m and n and to decide and print whether m is multiple of n.

import java.util.Scanner;

class week2_20
{
    public static void main(String[] args)
    {
        int m, n;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter m:");
        m = cin.nextInt();
        System.out.println("Enter n:");
        n = cin.nextInt();

        if(isMultiple(m, n))
            System.out.println(m + " is a multiple of " + n);
        else
            System.out.println(m + " is not a multiple of " + n);
    }

    static boolean isMultiple(int m, int n)
    {
        return m % n == 0;
    }
}
