/*
Create a class called Complex, which has three private instance variables –real and imaginary.
It contains a method called add( ) which takes one Complex object as parameter and print the added value
of the calling Complex object and passes Complex object. In the main method, declare two Complex objects
and assign values using constructor and call the add() method.
*/

import java.util.Scanner;

class week5_3
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        Complex obj1 = new Complex();
        System.out.println("Enter the first number:");
        System.out.print("real part:\t");
        obj1.real = cin.nextInt();
        System.out.print("imaginary part:\t");
        obj1.imaginary = cin.nextInt();

        Complex obj2 = new Complex();
        System.out.println("Enter the second number:");
        System.out.print("real part:\t");
        obj2.real = cin.nextInt();
        System.out.print("imaginary part:\t");
        obj2.imaginary = cin.nextInt();

        Complex obj3;
        obj3 = obj1.add(obj2);
    }
}

class Complex
{
    int real, imaginary;

    Complex add(Complex number)
    {
        Complex obj = new Complex();

        obj.real      = this.real + number.real;
        obj.imaginary = this.imaginary + number.imaginary;

        System.out.println("(" + this.real  + " +  i" + this.imaginary + ") + (" + number.real + " + i" + number.imaginary + ") = (" + obj.real + " + i" + obj.imaginary + ")");

        return obj;
    }
}
