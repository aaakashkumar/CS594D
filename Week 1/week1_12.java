// Write a Java program to check whether a year is  leap year or not.

import java.util.Scanner;

class week1_12
{
	public static void main(String[] args)
	{
		int year;

		Scanner cin = new Scanner(System.in);

		System.out.println("Enter the year to be checked:");
		year = cin.nextInt();

		CheckLeapYear obj = new CheckLeapYear();

		if(obj.isLeapYear(year))
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}

class CheckLeapYear
{
	boolean isLeapYear(int year)
	{
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
	}
}
