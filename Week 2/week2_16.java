// Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.

import java.util.Scanner;

class RadixConversions
{
    int binaryToDecimal(int number)
    {
        int decimal = 0, p = 0;

        while(number != 0)
        {
            decimal += ((number % 10) * Math.pow(2, p));
            number = number / 10;
            p++;
        }

        return decimal;
    }

    int decimalToBinary(int number)
    {
        int binary = 0, remainder;

        while(number > 0)
        {
            remainder = number % 2;
            binary = binary * 10 + remainder;
            number = number / 2;
        }

        return binary;
    }
}

class week2_16
{
    public static void main(String[] args)
    {
        int number;
        char choice;

        Scanner cin = new Scanner(System.in);

        System.out.println("'b' for binary to decimal");
        System.out.println("'d' for decimal to binary");
        choice = cin.next().charAt(0);

        while(choice != 'B' && choice != 'b' && choice != 'd' && choice != 'D')
        {
            System.out.println("Invalid input! Please try again:");
            System.out.println("'b' for binary to decimal");
            System.out.println("'d' for decimal to binary");
        }

        RadixConversions obj = new RadixConversions();

        System.out.println("Enter the number:");
        number = cin.nextInt();

        switch (choice)
        {
            case 'b': System.out.println("bin(" + number + ") = " + "dec(" + obj.binaryToDecimal(number) + ")"); break;
            case 'B': System.out.println("bin(" + number + ") = " + "dec(" + obj.binaryToDecimal(number) + ")"); break;
            case 'd': System.out.println("dec(" + number + ") = " + "bin(" + obj.decimalToBinary(number) + ")"); break;
            case 'D': System.out.println("dec(" + number + ") = " + "bin(" + obj.decimalToBinary(number) + ")"); break;
        }
    }
}
