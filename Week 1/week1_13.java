/*
Write a Java program for following grading system.
Note:
Percentage>=90%   :  Grade A
Percentage>=80%   :  Grade B
Percentage>=70%   :  Grade C
Percentage>=60%   :  Grade D
Percentage>=50%   :  Grade E
Percentage<40%    :  Grade F
*/

import java.util.Scanner;

class week1_13
{
    public static void main(String[] args)
    {
        double percentage;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the percentage obtained:");
        percentage = cin.nextDouble();

        Grade obj = new Grade();
        System.out.println("The grade obtained is " + obj.calculateGrade(percentage));
    }
}

class Grade
{
    char calculateGrade(double percentage)
    {
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'D';
        else if (percentage >= 50)
            return 'E';
        else if (percentage < 40)
            return 'F';
        else
            return 'X';
    }
}
