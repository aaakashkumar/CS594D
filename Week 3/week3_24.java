// Write a Java program to show 0-arguments constructor

class week3_23
{
    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor();
        obj.display();
    }
}

class TestConstructor
{
    String i;

    void display()
    {
        System.out.println(i);
    }

    TestConstructor()
    {
        i = "The Constructor has been called!";
    }
}