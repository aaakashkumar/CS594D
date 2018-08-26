/*
Write a program to define a class having one 3-digit number, num as data member.
Initialize and display reverse of that number.
*/

import java.util.Scanner;
import java.util.regex.Matcher;

class week5_4
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        String numberInput;
        System.out.println("Enter a 3 digit number:");
        numberInput = cin.next();
        while(!numberInput.matches("^(?=[1-9][0-9]+)[0-9]{3}$"))
        {
            System.out.println("Error. Please enter a 3 digit number:");
            numberInput = cin.next();
        }

        Reverse obj = new Reverse(Integer.parseInt(numberInput));
        System.out.println("The reverse of " + obj.num + " is " + obj.getReverse());
    }
}

class Reverse
{
    int num;

    Reverse(int num)
    {
        this.num = num;
    }

    int getReverse()
    {
        int numCopy = num, remainder, sum = 0;

        do
        {
            remainder = numCopy % 10;
            sum = sum * 10 + remainder;
            numCopy = numCopy / 10;
        }
        while (numCopy != 0);

        return  sum;
    }
}
