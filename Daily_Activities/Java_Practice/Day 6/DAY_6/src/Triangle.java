public class Triangle extends Shape 
{
    double base , height;

    public Triangle (double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double Area()
    {
        System.out.println("Area of Triangle");
        return 0.5 * base * height;
    }
}
