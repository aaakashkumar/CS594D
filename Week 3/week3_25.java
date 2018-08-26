// Write a Java program to show parameterized constructor

class week3_25
{
    public static void main(String[] args) 
    {
        TestConstructor obj = new TestConstructor("Hello from the constructor side!");
    }
}

class TestConstructor
{
    TestConstructor(String constructorString)
    {
        System.out.println(constructorString);
    }
}