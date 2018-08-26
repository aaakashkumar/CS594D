/*
Write Java program for the pattern given below:
1      1
 2    2
  3  3
   4
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

         int innerSpace = n * 2 - 2;
         for (int i = 1; i <= n; ++i)
         {
             for (int space = 1; space <= i - 1; ++space)
             {
                 System.out.print(" ");
             }

             System.out.print(i);
             for (int j = 1; j <= innerSpace; ++j)
             {
                 System.out.print(" ");
             }
             innerSpace -= 2;
             if(i != n)
                System.out.print(i);

             System.out.println();
         }
     }
 }
