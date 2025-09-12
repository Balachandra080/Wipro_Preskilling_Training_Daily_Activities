public class Student extends Human 
{
    public String studentCode;

    Student(String name, int age, String studentCode)
    {
        super(name, age);
        this.studentCode = studentCode;
    }
}