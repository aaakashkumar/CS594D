 // Write program, which finds the sum of numbers formed by consecutive digits.  Input : 2415  output : 24+41+15=80.

import java.util.Scanner;

 class week5_21
 {
     public static void main(String[] args)
     {
         int number, sum = 0;

         Scanner cin = new Scanner(System.in);
         System.out.println("Enter the number:");
         number = cin.nextInt();

         // [Convert integer to array of digits] https://stackoverflow.com/a/8033593/6722799
         String temp = Integer.toString(number);
         int[] numberArray = new int[temp.length()];
         for (int i = 0; i < temp.length(); ++i)
         {
             numberArray[i] = temp.charAt(i) - '0';
         }

         for (int i = 0; i < temp.length() - 1; ++i)
         {
             sum += numberArray[i] * 10 + numberArray[i + 1];
         }

         System.out.println("Sum of consecutive digits of " + number + " is " + sum + ".");
     }
 }
