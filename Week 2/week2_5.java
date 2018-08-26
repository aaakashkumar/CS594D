/*
Admission to a professional course is subject to the following conditions:
(a)  marks in Mathematics   >= 60
(b)  marks in Physics       >= 50
(c)  marks in Chemistry     >= 40
(d) Total in all 3 subjects >= 200

(Or)

Total in Maths & Physics    >= 150
Given the marks in the 3 subjects of n (user input) students,
write a program to process the applications to list the eligible candidates.
*/

import java.util.Scanner;

class Admission
{
    int rollNumber;
    int marksInMathematics;
    int marksInPhysics;
    int marksInChemistry;
    int totalMarks;
    int totalMathsAndPhysics;

    Admission(int rollNumber, int marksInPhysics, int marksInChemistry, int marksInMathematics)
    {
        this.rollNumber         = rollNumber;
        this.marksInPhysics     = marksInPhysics;
        this.marksInChemistry   = marksInChemistry;
        this.marksInMathematics = marksInMathematics;

        totalMarks = marksInPhysics + marksInChemistry + marksInMathematics;
        totalMathsAndPhysics = marksInPhysics + marksInMathematics;
    }

    String eligibility()
    {
        if (marksInMathematics >= 60 && marksInPhysics >= 50 && marksInChemistry >= 40 && totalMarks >= 200)
            return "eligible";
        else if (totalMathsAndPhysics >= 150)
            return  "eligible";
        else
            return "not eligible";
    }
}

class week2_5
{
    public static void main(String[] args)
    {
        int numberOfStudents = 0, rollNumber, marksInPhysics, marksInChemistry, marksInMathematics;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        numberOfStudents = cin.nextInt();

        Admission objs[] = new Admission[numberOfStudents];

        for (int i = 0; i < numberOfStudents; ++i)
        {
            System.out.println("Student " + (i + 1));

            System.out.println("Enter the roll number");
            rollNumber = cin.nextInt();

            System.out.println("Enter the marks obtained in physics:");
            marksInPhysics = cin.nextInt();
            System.out.println("Enter the marks obtained in maths:");
            marksInMathematics = cin.nextInt();
            System.out.println("Enter the marks obtained in chemistry:");
            marksInChemistry = cin.nextInt();

            objs[i] = new Admission(rollNumber, marksInPhysics, marksInChemistry, marksInMathematics);
        }

        for(int i = 0; i < numberOfStudents; i++)
        {
            System.out.println("Roll number " + objs[i].rollNumber + " is " + objs[i].eligibility() + " for admission.");
        }
    }
}
