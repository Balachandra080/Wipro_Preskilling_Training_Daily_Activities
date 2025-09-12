public class Intern implements Human
{
    public void eat()
    {
        System.out.println("Breakfast - Lunch");
    }

    public String tellYourName()
    {
        return "My intern";
    }

    public int add(int a, int b)
    {
        return (a+b);
    }

    public int add(int a, int b, int c)
    {
        return (a+b+c);
    }
}
