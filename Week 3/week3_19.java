// Write a Java program to multiply two matrices.

import java.util.Scanner;

class week3_19
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[][] arr1, arr2, finalArray;
        int rows1, columns1, rows2, columns2;

        System.out.println("Enter the dimensions of the first matrix:");
        System.out.println("rows:");
        rows1 = cin.nextInt();
        System.out.println("columns:");
        columns1 = cin.nextInt();

        System.out.println("Enter the dimensions of the second matrix:");
        System.out.println("rows:");
        rows2 = cin.nextInt();
        System.out.println("columns:");
        columns2 = cin.nextInt();

        if(columns1 != rows2)
        {
            System.out.println("Error. Matrix dimensions do not comply.");
            System.exit(0);
        }

        arr1 = new int[rows1][columns1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; ++i)
        {
            for (int j = 0; j < columns1; ++j)
            {
                System.out.print("arr1[" + (i+1) + "][" + (j+1) + "]: ");
                arr1[i][j] = cin.nextInt();
            }
        }

        arr2 = new int[rows2][columns2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; ++i)
        {
            for (int j = 0; j < columns2; ++j)
            {
                System.out.print("arr2[" + (i+1) + "][" + (j+1) + "]: ");
                arr2[i][j] = cin.nextInt();
            }
        }

        finalArray = new int[rows1][columns2];
        for (int i = 0; i < rows1; ++i)
        {
            for (int j = 0; j < columns2; ++j)
            {
                finalArray[i][j] = 0;
                for (int k = 0; k < columns1; ++k)
                {
                    finalArray[i][j] = finalArray[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("A = ");
        print2DArray(arr1, rows1, columns1);

        System.out.println("B = ");
        print2DArray(arr2, rows2, columns2);

        System.out.println("A x B = ");
        print2DArray(finalArray, rows1, columns2);
    }

    static void print2DArray(int[][] arr, int rows, int columns)
    {
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
