public class Geometry 
{
    public static void main(String[] args)
    {
        Circle C = new Circle (5.0);
        Rectangle R = new Rectangle (3.0, 4.0);
        Triangle T = new Triangle(3.0, 8.0);

        System.out.println("Circle Area : " + C.Area());
        System.out.println("Rectangle Area : " + R.Area());
        System.out.println("Triangle Area : " + T.Area());
    }
}
