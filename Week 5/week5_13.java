/*
Design a class named Account that contains:
I.    A private int data field named id for the account (default 0).
II.   A private double data field named balance for the account (default 0).
III.  A private double data field named annualInterestRate that stores the current interest rate (default 0).
      Assume all accounts have the same interest rate.
IV.   A private Date data field named dateCreated that stores the date when the account was created.
V.    A no-arg constructor that creates a default account.
VI.   A constructor that creates an account with the specified id and initial balance.
VII.  The accessor and mutator methods for id,balance, and annualInterestRate.
VIII. The accessor method for dateCreated.
IX.   A method named getMonthlyInterestRate() that returns the monthly interest rate.
X.    A method named getMonthlyInterest() that returns the monthly interest.
XI.   A method named withdraw that withdraws a specified amount from the account.
XII.  A method named deposit that deposits a specified amount to the account.
*/

import java.util.*;
import java.time.LocalDate;

class Account
{
    private int id;
    private double balance, annualInterestRate;
    private LocalDate dateCreated;

    Account()
    {
        Random rand = new Random();

        setID(rand.nextInt(99999) + 100000);
        dateCreated = LocalDate.now();
        setBalance(0);
        setAnnualInterestRate(6);
    }

    Account(int id, double balance)
    {
        setID(id);
        dateCreated = LocalDate.now();
        setBalance(balance);
        setAnnualInterestRate(6);
    }

    void setID(int id)
    {
        this.id = id;
    }

    void setBalance(double balance)
    {
        this.balance = balance;
    }

    void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    int getID()
    {
        return id;
    }

    double getBalance()
    {
        return balance;
    }

    double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    LocalDate getDateCreated()
    {
        return dateCreated;
    }

    double getMonthlyInterestRate()
    {
        return (getAnnualInterestRate() / 12.0);
    }

    double getMonthlyInterest()
    {
        return ((balance * getAnnualInterestRate()) / 100.0);
    }

    void withdraw(double amount)
    {
        if (amount > balance)
        {
            System.out.println("Insufficient balance!");
            return;
        }

        setBalance(balance - amount);
    }

    void deposit(double amount)
    {
        setBalance(balance + amount);
    }
}

class week5_3
{
    public static void main(String[] args)
    {
        System.out.println("Menu:");
        System.out.println("1. Create Default Account");
        System.out.println("2. Create Account");
        System.out.println("3. Check ID");
        System.out.println("4. Check Balance");
        System.out.println("5. Check Annual Interest Rate");
        System.out.println("6. Check Monthly Interest Rate");
        System.out.println("7. Check Monthly Interest");
        System.out.println("8. Check date of opening");
        System.out.println("9. Withdraw money");
        System.out.println("10. Deposit money");
        System.out.println("11. Exit");

        Account obj = new Account();

        while(true)
        {
            int choice, tempInt;
            double tempDouble;
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter option:");
            choice = cin.nextInt();

            switch(choice)
            {
                case 1:
                obj = new Account();
                break;

                case 2:
                System.out.println("Enter ID:");
                tempInt = cin.nextInt();
                System.out.println("Enter balance:");
                tempDouble = cin.nextDouble();
                obj = new Account(tempInt, tempDouble);
                break;

                case 3:
                System.out.println(obj.getID());
                break;

                case 4:
                System.out.println(obj.getBalance());
                break;

                case 5:
                System.out.println(obj.getAnnualInterestRate());
                break;

                case 6:
                System.out.println(obj.getMonthlyInterestRate());
                break;

                case 7:
                System.out.println(obj.getMonthlyInterest());
                break;

                case 8:
                System.out.println(obj.getDateCreated());
                break;

                case 9:
                System.out.println("Enter amount to be withdrawn:");
                tempDouble = cin.nextDouble();
                obj.withdraw(tempDouble);
                break;

                case 10:
                System.out.println("Enter amount to deposit:");
                tempDouble = cin.nextDouble();
                obj.deposit(tempDouble);
                break;

                case 11:
                System.exit(10);

                default:
                System.out.println("Invalid option.");
            }
        }
    }
}
