/* 
Write a class, Grader, which has an instance variable, score, 
an appropriate constructor and  appropriate  methods.  
A  method,  letterGrade()  that  returns  the  letter  grade  as  O/E/A/B/C/F. 
Now write a demo class to test the Grader class by reading a score from the user, 
using it  to  create  a  Grader  object  after  validating  that  the  value  is  
not  negative  and  is  not greater then 100. Finally, call the letterGrade() method 
to get and print the grade. 
*/

import java.util.Scanner;

class week3_27
{
    public static void main(String[] args) 
    {
        int grade;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the grade:");
        
        do
        {
            System.out.println("(Range: 0 to 100)");
            grade = cin.nextInt();
        }while(grade < 0 || grade > 100);
        
        Grader student = new Grader(grade);
        System.out.println("The grade obtained is " + student.letterGrade());
    }
}

class Grader
{
    int score;

    Grader(int score)
    {
        this.score = score;
    }

    String letterGrade()
    {
        if(score <= 100 && score > 90)
            return "O";
        else if(score <= 90 && score > 80)
            return "E";
        else if(score <= 80 && score > 70)
            return "A";
        else if(score <= 70 && score > 60)
            return "B";
        else if(score <= 60 && score > 50)
            return "C";
        else
            return "F";
    }
}