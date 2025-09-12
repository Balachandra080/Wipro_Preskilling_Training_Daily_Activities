public class Rectangle  extends Shape 
{
    double length;
    double width;

    public Rectangle (double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double Area() 
    {
        System.out.println("Area of Rectangle");
        return length * width;
    }
}    
