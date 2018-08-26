/*
Write Java program for the pattern given below:
 1
 2 3 4
 5 6 7 8 9
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

         int j = 1;
         for (int i = 1; i <= n ; ++i)
         {
             for (; j <= i * i; ++j)
             {
                 System.out.print(j + "\t");
             }
             System.out.println();
         }
     }
 }
