/* 
Write  a  class,  Commission,  which  has  an  instance  variable,  sales;  
an  appropriate constructor; and a method, commission() that returns the commission.
Now  write a demo class to test the Commission class by reading a sale from the user, 
using  it  to  create  a  Commission  object  after  validating  that  the  value  is  not  negative. 
Finally,  call  the  commission()  method  to  get  and  print  the  commission.  
If  the  sales  are negative, your demo should print the message "Invalid Input". 
*/

import java.util.Scanner;

class week3_28
{
    public static void main(String[] args) 
    {
        int sales;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the amount of sales:");
        sales = cin.nextInt();
        
        Commission employee = new Commission(sales);

        if(sales < 0)
            System.out.println("Invalid input!");
        else
            System.out.println("Your commission is " + employee.getCommission());
    }
}

class Commission
{
    int sales;

    Commission(int sales)
    {
        this.sales = sales;
    }

    int getCommission()
    {
        if (sales > 1000)
            return 1000;
        else
            return 2000;
    }
}