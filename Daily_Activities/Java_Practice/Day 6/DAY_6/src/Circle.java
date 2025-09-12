public class Circle extends Shape 
{
    double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double Area()
    {
        System.out.println("Area of Circle");
        return Math.PI * radius * radius;
    }
}
