/*
Write a program to accept value of apple sales for each day of the week (using array of type float) and then,
calculate the average sale of the week.
*/

import java.util.Scanner;

class week5_20
{
    public static void main(String[] args)
    {
        float[] appleSales = new float[7];
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday"};

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the sales for the week:");
        for (int i = 0; i < 7; ++i)
        {
            System.out.print(days[i] + ": ");
            appleSales[i] = cin.nextFloat();
        }

        System.out.println("Average sales of the week = " + averageSales(appleSales));
    }

    static float averageSales(float[] appleSales)
    {
        float average = 0;
        for (int i = 0; i < 7; ++i)
        {
            average += appleSales[i];
        }
        average /= 7;
        return average;
    }
}
