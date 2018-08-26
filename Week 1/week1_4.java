// Write a Java program to change temperature from Fahrenheit to Celsius

import java.util.Scanner;

class week1_2
{
    public static void main(String[] args)
    {
        double celsius, fahrenheit;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        fahrenheit = cin.nextDouble();

        System.out.println(fahrenheit + " ° F = " + FahrenheitToCelsius(fahrenheit) + " ° C.");
    }

    public static double FahrenheitToCelsius(double fahrenheit)
    {
        return ((fahrenheit - 32) * 5 / 9);
    }
}
