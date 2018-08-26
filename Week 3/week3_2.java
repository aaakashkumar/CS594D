// Write a Java program to implement stack using array.

import java.util.Scanner;

class Stack
{
    int[] arr;
    int max, top;

    Stack(int max)
    {
        this.max = max;
        arr = new int[max];
        top = -1;
    }

    void push(int element)
    {
        ++top;

        if (isFull())
        {
            System.out.println("Error. Stack overflow.");
            --top;
            return;
        }
        arr[top] = element;
    }

    int pop()
    {
        if (isEmpty())
        {
            System.out.println("Error. Stack underflow.");
            return -1;
        }

        --top;
        return arr[top + 1];
    }

    int peek()
    {
        if (isEmpty())
        {
            System.out.print("Error. Stack underflow.");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    boolean isFull()
    {
        return top == max;
    }
}

class week3_2
{
    public static void main(String[] args)
    {
        int max, option, tempVariable;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        max = cin.nextInt();

        Stack st = new Stack(max);

        System.out.println("Stack:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Check if empty");
        System.out.println("4. Check if full");
        System.out.println("5. Peek");
        System.out.println("6. Exit");

        while(true)
        {
            System.out.println("Enter option:");
            option = cin.nextInt();

            switch(option)
            {
                case 1:
                System.out.println("Enter element to be pushed:");
                tempVariable = cin.nextInt();
                st.push(tempVariable);
                break;

                case 2:
                System.out.println(st.pop() + " has been popped.");
                break;

                case 3:
                if(st.isEmpty())
                    System.out.println("Stack is empty");
                else
                    System.out.println("Stack is not empty");
                break;

                case 4:
                if(st.isFull())
                    System.out.println("Stack is full");
                else
                    System.out.println("Stack is not full");
                break;

                case 5:
                System.out.println(st.peek());
                break;

                case 6:
                System.exit(0);

                default:
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
