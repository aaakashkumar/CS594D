/*
Write a program to define a class 'employee' with data members as empid, name and salary.
Accept data for 5 objects using Array of objects and print it.
*/

import java.util.Scanner;

class week5_10
{
    public static void main(String[] args)
    {
        Employee[] obj = new Employee[5];
        int empid, salary;
        String name;

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 5; ++i)
        {
            System.out.print("Enter employee name: ");
            name = cin.next();
            System.out.print("Enter employee ID: ");
            empid = cin.nextInt();
            System.out.print("Enter salary: ");
            salary = cin.nextInt();

            obj[i] = new Employee(name, empid, salary);
        }

        displayEmployeeDetails(obj);
    }

    static void displayEmployeeDetails(Employee[] obj)
    {
        System.out.println("Name\tID\tSalary");
        for (int i = 0; i < 5; ++i)
        {
            System.out.println(obj[i].name + "\t" + obj[i].empid + "\t" + obj[i].salary);
        }
    }
}

class Employee
{
    int empid, salary;
    String name;

    Employee(String name, int empid, int salary)
    {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
}
