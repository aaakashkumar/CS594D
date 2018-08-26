/*
Create a class called Time, 
which has three private instance variables – hour, min and sec. 
It contains a method called add( ) which takes one Time object as parameter and 
print the added value of the calling Time object and passed Time object. 
In the main method, declare two Time objects and assign values using constructor and 
call the add() method.
*/

import java.util.Scanner;

class Time
{
    private int hour, min, sec;

    Time(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min  = min;
        this.sec  = sec;
    }

    void add(Time t)
    {
        System.out.print(this.hour + ":" + this.min + ":" + this.sec
                           + " + " + t.hour + ":" + t.min + ":" + t.sec + " = ");

        this.sec += t.sec;
        if(this.sec > 59)
        {
            this.sec -= 60;
            this.min += 1;
        }

        this.min += t.min;
        if(this.min > 59)
        {
            this.min -= 60;
            this.hour += 1;
        }

        this.hour += t.hour;

        System.out.println(this.hour + ":" + this.min + ":" + this.sec);
    }
}

class week5_2
{
    public static void main(String[] args) 
    {
        int hour1, hour2, min1, min2, sec1, sec2;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the first time");
        System.out.println("Hour:");
        hour1 = cin.nextInt();
        System.out.println("Minute:");
        min1 = cin.nextInt();
        System.out.println("Second:");
        sec1 = cin.nextInt();

        System.out.println("Enter the second time");
        System.out.println("Hour:");
        hour2 = cin.nextInt();
        System.out.println("Minute:");
        min2 = cin.nextInt();
        System.out.println("Second:");
        sec2 = cin.nextInt();

        Time obj1 = new Time(hour1, min1, sec1);
        Time obj2 = new Time(hour2, min2, sec2);

        obj1.add(obj2);
    }
}