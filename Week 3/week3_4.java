// Write a Java program to calculate Sum of two 2-dimensional arrays.

import java.util.Scanner;

class week3_4
{
    public static void main(String[] args)
    {
        int[][] arr1, arr2, sum;
        int rows, columns;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the order of arrays:");
        System.out.print("rows: ");
        rows = cin.nextInt();
        System.out.print("columns: ");
        columns = cin.nextInt();

        arr1 = new int[rows][columns];
        arr2 = new int[rows][columns];
        sum  = new int[rows][columns];

        System.out.println("Enter the first array:");
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                System.out.print("arr[" + (i+1) + "][" + (j+1) + "]: ");
                arr1[i][j] = cin.nextInt();
            }
        }

        System.out.println("Enter the second array:");
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                System.out.print("arr[" + (i+1) + "][" + (j+1) + "]: ");
                arr2[i][j] = cin.nextInt();
            }
        }

        System.out.println("The sum of the above arrays is:");
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
