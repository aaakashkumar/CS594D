// Write a Java program to calculate factorial of 12.

class week2_2
{
    public static void main(String[] args)
    {
        int number = 12;
        System.out.println(number + "! = " + getFactorial(number));;
    }

    static int getFactorial(int number)
    {
        int factorial = 1;

        if (number == 0)
            return 1;

        for (int i = number; i > 0; --i)
        {
            factorial *= i;
        }

        return factorial;
    }
}
