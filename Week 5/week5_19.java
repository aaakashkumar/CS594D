// Write a program to demonstrate use of 'static' keyword.

class week5_20
{
    public static void main(String[] args)
    {
        System.out.println("This is main()!");
        staticDemonstrator();
    }

    static void staticDemonstrator()
    {
        System.out.println("This is staticDemonstrator() which could be accessed from main() because it is a static method!");
    }
}
