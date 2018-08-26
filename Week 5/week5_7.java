/*
Write a program to define a class Fraction having data members numerator and denominator.
Initialize three objects using different constructors and display its fractional value.
*/

import java.util.Scanner;

class week5_7
{
    public static void main(String[] args)
    {
        int intNumerator, intDenominator;
        double doubleNumerator, doubleDenominator;
        float floatNumerator, floatDenominator;

        Scanner cin = new Scanner(System.in);

        Fraction obj;

        System.out.print("Enter numerator of type int: ");
        intNumerator = cin.nextInt();
        System.out.print("Enter denominator of type int: ");
        intDenominator = cin.nextInt();
        obj = new Fraction(intNumerator, intDenominator);
        System.out.println("The fraction value of int(" + intNumerator + "/" + intDenominator + ") is " + obj.intFractionalValue);

        System.out.print("Enter numerator of type double: ");
        doubleNumerator = cin.nextDouble();
        System.out.print("Enter denominator of type double: ");
        doubleDenominator = cin.nextDouble();
        obj = new Fraction(doubleNumerator, doubleDenominator);
        System.out.println("The fraction value of double(" + doubleNumerator + "/" + doubleDenominator + ") is " + obj.doubleFractionalValue);

        System.out.print("Enter numerator of type float: ");
        floatNumerator = cin.nextFloat();
        System.out.print("Enter denominator of type float: ");
        floatDenominator = cin.nextFloat();
        obj = new Fraction(floatNumerator, floatDenominator);
        System.out.println("The fraction value of float(" + floatNumerator + "/" + floatDenominator + ") is " + obj.floatFractionalValue);
    }
}

class Fraction
{
    int intFractionalValue;
    double doubleFractionalValue;
    float floatFractionalValue;

    Fraction(double numerator, double denominator)
    {
        doubleFractionalValue = numerator / denominator;
    }

    Fraction(int numerator, int denominator)
    {
        intFractionalValue = numerator / denominator;
    }

    Fraction(float numerator, float denominator)
    {
        floatFractionalValue = numerator / denominator;
    }
}
