// Write a program that reads ten numbers, computes their average, and finds out how many numbers are above the average. [Use this keyword]

import java.util.Scanner;

class Average
{
    int[] numbers;
    int arraySize, aboveAverageCount;
    double average;

    Average(int[] numbers, int arraySize)
    {
        this.numbers = numbers;
        this.arraySize = arraySize;
        average = calculateAverage();
        aboveAverageCount = calculateAboveAverageCount();
    }

    double calculateAverage()
    {
        average = 0;
        for (int i = 0; i < 10; ++i)
        {
            average += numbers[i];
        }
        average /= arraySize;

        return average;
    }

    int calculateAboveAverageCount()
    {
        aboveAverageCount = 0;
        for (int i = 0; i < 10; ++i)
        {
            if (numbers[i] > average)
            {
                ++aboveAverageCount;
            }
        }

        return aboveAverageCount;
    }
}

class week5_16
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; ++i)
        {
            numbers[i] = cin.nextInt();
        }

        Average obj = new Average(numbers, 10);
        System.out.println("Average = " + obj.average);
        System.out.println(obj.aboveAverageCount + " numbers are above average");
    }
}
