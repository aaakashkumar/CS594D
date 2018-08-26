// Write a program to define a class Employee to accept emp_id, emp _name, basic_salary from the user and display the gross_salary.

import java.util.Scanner;

class week5_6
{
    public static void main(String[] args)
    {
        int emp_id, basic_salary, hra, da;
        String emp_name;

        Scanner cin = new Scanner(System.in);

        System.out.print("Enter your name: ");
        emp_name = cin.next();
        System.out.print("Enter your Employee ID: ");
        emp_id = cin.nextInt();
        System.out.print("Enter the basic salary: ");
        basic_salary = cin.nextInt();
        System.out.print("Enter the House Rent Allowance (HRA) amount: ");
        hra = cin.nextInt();
        System.out.print("Enter the Dearness Allowance (DA) amount: ");
        da = cin.nextInt();

        Employee obj = new Employee(emp_name, emp_id, basic_salary, hra, da);
        obj.displayGrossSalary();
    }
}

class Employee
{
    int emp_id, basic_salary, gross_salary, hra, da;
    String emp_name;

    Employee(String emp_name, int emp_id, int basic_salary, int hra, int da)
    {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.basic_salary = basic_salary;
        this.hra = hra;
        this.da = da;

        gross_salary = basic_salary + hra + da;
    }

    void displayGrossSalary()
    {
        System.out.println("Your gross salary is " + gross_salary + ".");
    }
}
