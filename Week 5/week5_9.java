/*
Write a program to define a class Tender containing data members cost and company name.
Accept data for five objects and display company name for which cost is minimum.
*/

import java.util.Scanner;

class week5_9
{
    public static void main(String[] args)
    {
        Tender[] obj = new Tender[5];
        int cost;
        String companyName;

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 5; ++i)
        {
            System.out.print("Enter company name:");
            companyName = cin.next();
            System.out.print("Enter cost:");
            cost = cin.nextInt();

            obj[i] = new Tender(companyName, cost);
        }

        System.out.println("The cost is minimum for " + obj[findMinimumCostIndex(obj)].companyName + ".");
    }

    static int findMinimumCostIndex(Tender[] obj)
    {
        int minimum = obj[0].cost, minimumIndex = 0;

        for (int i = 1; i < 5; ++i)
        {
            if(obj[i].cost < minimum)
            {
                minimum = obj[i].cost;
                minimumIndex = i;
            }
        }

        return minimumIndex;
    }
}

class Tender
{
    int cost;
    String companyName;

    Tender(String companyName, int cost)
    {
        this.companyName = companyName;
        this.cost = cost;
    }
}
