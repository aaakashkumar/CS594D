// Write a Java program to find the sum of diagonal elements in a 2D array.

import java.util.Scanner;

class week3_8
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[][] arr;
        int rows, columns, sum = 0;

        System.out.println("Enter the dimensions of the array:");
        System.out.println("rows:");
        rows = cin.nextInt();
        System.out.println("columns:");
        columns = cin.nextInt();

        arr = new int[rows][columns];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                System.out.print("arr[" + (i+1) + "][" + (j+1) + "]: ");
                arr[i][j] = cin.nextInt();
                if(i == j)
                    sum += arr[i][j];
            }
        }

        System.out.println("The sum of diagonal elements in the array is " + sum);
    }
}
