/*
Write Java program for the pattern given below:
      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
*/

import java.util.Scanner;

 class week2_23
 {
     public static void main(String[] args)
     {
         int n;

         System.out.println("Enter the value of n (number of lines):");
         Scanner cin = new Scanner(System.in);
         n = cin.nextInt();

         for(int i = 1; i <= n; ++i)
         {
             for (int space = 1; space <= n - i; ++space)
             {
                 System.out.print("  ");
             }

             for (int j = i; j > 1; --j)
             {
                 System.out.print(j + " ");
             }

             for (int j = 1; j <= i; ++j)
             {
                 System.out.print(j + " ");
             }

             System.out.println();
         }
     }
 }
