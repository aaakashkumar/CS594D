// Write a Java program to change temperature from Celsius to Fahrenheit

import java.util.Scanner;

class week1_2
{
    public static void main(String[] args)
    {
        double celsius, fahrenheit;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        celsius = cin.nextDouble();

        System.out.println(celsius + " ° C = " + CelsiusToFahrenheit(celsius) + " ° F.");
    }

    public static double CelsiusToFahrenheit(double celsius)
    {
        return ((celsius * 9 / 5) + 32);
    }
}
