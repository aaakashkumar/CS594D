/*
Write a test program that prompts the user to enter the investment amount (e.g., 1000)
and the interest rate (e.g., 9%), and print a table that displays future value for the years from 1 to 30,
as shown below:
The amount invested: 1000
Annual interest rate: 9%
Years       Future Value
1          1093.8
2          1196.41
...
29         13467.25
30         14730.57
*/

import java.util.Scanner;

class week5_14
{
    public static void main(String[] args)
    {
        double amount, interestRate;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the investment amount:");
        amount = cin.nextDouble();
        System.out.println("Enter the interest rate:");
        interestRate = cin.nextDouble();

        System.out.println("Years\tFuture Value");
        for (int i = 1; i <= 30; ++i)
        {
            amount += amount * interestRate / 100;

            System.out.println(i + "\t" + amount);
        }

    }
}
