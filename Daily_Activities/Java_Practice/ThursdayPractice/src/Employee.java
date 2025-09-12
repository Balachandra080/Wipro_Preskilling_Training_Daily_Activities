public class Employee implements Human
{
    public void eat()
    {
        System.out.println("Breakfast - Lunch - Dinner");
    }

    public String tellYourName()
    {
        return "MyName";
    }

    public int add(int a, int b)
    {
        return (a+b);
    }

    public void makeEntry()
    {
        System.out.println("I make attendanvce entry");
    }

    public static void main(String[] args) 
    {
        Employee e =new Employee();
        e.eat();
        System.out.println(e.tellYourName());
        System.out.println(e.add(10, 20));
        e.makeEntry();
    }
}