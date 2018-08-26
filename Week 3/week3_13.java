// Write a Java program to check whether a given matrix is sparse or not.

import java.util.Scanner;

class week3_13
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[][] arr;
        int rows, columns, zeroCount = 0;

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

                if(arr[i][j] == 0)
                    ++zeroCount;
            }
        }

        if(zeroCount > (rows * columns) / 2)
            System.out.println("The array entered is a sparse matrix.");
        else
            System.out.println("The array entered is not a sparse matrix.");
    }
}
