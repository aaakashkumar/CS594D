/*
Write a program to define a class Student with four data members such as name, roll no., sub1, and sub2.
Define appropriate methods to initialize and display the values of data members.
Also calculate total marks and percentage scored by student.
*/

import java.util.Scanner;

class week5_5
{
    public static void main(String[] args)
    {
        int rollno, sub1, sub2;
        String name;

        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the students name:");
        name = cin.next();
        System.out.print("Enter the students' roll number:");
        rollno = cin.nextInt();
        System.out.print("Enter the students' marks in Maths out of 100:");
        sub1 = cin.nextInt();
        System.out.print("Enter the students' marks in Physics out of 100:");
        sub2 = cin.nextInt();

        Student obj = new Student(name, rollno, sub1, sub2);
        obj.displayDetails();
    }
}

class Student
{
    int rollno, sub1, sub2, totalMarks, percentage;
    String name;

    Student(String name, int rollno, int sub1, int sub2)
    {
        this.name = name;
        this.rollno = rollno;
        this.sub1 = sub1;
        this.sub2 = sub2;
        totalMarks = sub1 + sub2;
        percentage = totalMarks * 100 / 200;
    }

    void displayDetails()
    {
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Roll no.: " + rollno);
        System.out.println("Marks in mathematics: " + sub1);
        System.out.println("Marks in physics: " + sub2);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + " %");
    }
}
