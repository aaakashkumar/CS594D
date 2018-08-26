 // Write a Java program to implement Queue using array.

 import java.util.Scanner;

 class Queue
 {
     int[] arr;
     int front, rear, size;

     Queue(int size)
     {
         this.size = size;
         front = rear = -1;
         arr = new int[size];
     }

     void enqueue(int element)
     {
         if (isFull())
         {
             System.out.println("Error. Queue is full.");
             return;
         }

         if(front == -1 && rear == -1)
         {
             ++front;
             ++rear;

             arr[rear] = element;
         }

         else
         {
             ++rear;

             if (front == rear)
             {
                 front = rear = -1;
             }

             arr[rear] = element;
         }
     }

     int dequeue()
     {
         if(isEmpty())
         {
             System.out.println("Error. Queue empty.");
             return -1;
         }

         ++front;
         return arr[front - 1];
     }

     int peek()
     {
         if(isEmpty())
         {
             System.out.println("Error. Queue empty.");
             return -1;
         }

         return arr[front];
     }

     boolean isEmpty()
     {
         if(front == -1)
            return true;
         else if(front > rear)
            return true;
         else
            return false;
     }

     boolean isFull()
     {
         if(rear == size - 1 || rear < front)
            return true;
        else
            return false;
     }

     void display()
     {
         for (int i = front; i <= rear; ++i)
         {
             System.out.print(arr[i] + "\t");
         }
         System.out.println();
     }
 }

 class week3_2
 {
     public static void main(String[] args)
     {
         int size, option, tempVariable;

         Scanner cin = new Scanner(System.in);
         System.out.println("Enter the size of queue:");
         size = cin.nextInt();

         Queue q = new Queue(size);

         System.out.println("Stack:");
         System.out.println("1. Enqueue");
         System.out.println("2. Dequeue");
         System.out.println("3. Check if empty");
         System.out.println("4. Check if full");
         System.out.println("5. Peek");
         System.out.println("6. Display");
         System.out.println("7. Exit");

         while(true)
         {
             System.out.println("Enter option:");
             option = cin.nextInt();

             switch(option)
             {
                 case 1:
                 System.out.println("Enter element to be enqueued:");
                 tempVariable = cin.nextInt();
                 q.enqueue(tempVariable);
                 break;

                 case 2:
                 System.out.println(q.dequeue() + " has been dequeued.");
                 break;

                 case 3:
                 if(q.isEmpty())
                     System.out.println("Queue is empty");
                 else
                     System.out.println("Queue is not empty");
                 break;

                 case 4:
                 if(q.isFull())
                     System.out.println("Queue is full");
                 else
                     System.out.println("Queue is not full");
                 break;

                 case 5:
                 System.out.println(q.peek());
                 break;

                 case 6:
                 q.display();
                 break;

                 case 7:
                 System.exit(0);

                 default:
                 System.out.println("Invalid input. Please try again.");
             }
         }
     }
 }
