 // Write a program to demonstrate use of 'this' keyword.

class ThisDemonstrator
{
    String demonstrator;

    ThisDemonstrator(String demonstrator)
    {
        this.demonstrator = demonstrator;
    }

    void demonstrate()
    {
        System.out.println(demonstrator);
    }
}

class week5_18
{
    public static void main(String[] args)
    {
        ThisDemonstrator obj = new ThisDemonstrator("This string was initialized with this!");
        obj.demonstrate();
    }
}
