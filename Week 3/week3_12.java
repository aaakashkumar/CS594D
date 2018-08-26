// Write a Java program to print transpose of matrix.

import java.util.Scanner;

class week3_12
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int[][] arr;
        int rows, columns;

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
            }
        }

        ArrayOperations obj = new ArrayOperations(arr, rows, columns);

        System.out.println("A = ");
        obj.print2DArray();

        obj.transposeArray();

        System.out.println("A' = ");
        obj.print2DArray();
    }
}

class ArrayOperations
{
    int[][] arr;
    int rows, columns;

    ArrayOperations(int[][] arr, int rows, int columns)
    {
        this.arr = arr;
        this.rows = rows;
        this.columns = columns;
    }

    void print2DArray()
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

    void transposeArray()
    {
        int temp;
        int[][] transpose = new int[rows][columns];
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
        s    {
                transpose[j][i] = arr[i][j];
            }
        }

        arr = transpose;
    }
}
