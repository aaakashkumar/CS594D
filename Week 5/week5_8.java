/*
Write a program to define a class Item containing code and price.
Accept this data for five objects using array of objects.
Display code, price in tabular form and also, display total price of all items.
*/

import java.util.Scanner;

class week5_8
{
    public static void main(String[] args)
    {
        int code, price, sum = 0;
        Item[] obj = new Item[5];

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 5; ++i)
        {
            System.out.print("Enter item code for item " + (i + 1) + ": ");
            code = cin.nextInt();
            System.out.print("Enter price for item " + (i + 1) + ": ");
            price = cin.nextInt();

            obj[i] = new Item(code, price);

            sum += price;
        }

        System.out.println("Item Code\tPrice");
        for (int i = 0; i < 5; ++i)
        {
            obj[i].display();
        }
        System.out.println("Total \t\t" + sum);
    }
}

class Item
{
    int code, price;

    Item(int code, int price)
    {
        this.code = code;
        this.price = price;
    }

    void display()
    {
        System.out.println(code + "\t\t" + "Rs " + price);
    }
}
