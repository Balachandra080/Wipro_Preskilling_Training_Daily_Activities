public class Intern extends Developer 
{
    public static String education;

    public Intern(String name, int empNo, String gender, int experience, double salary, String education) 
    {
        super(name, empNo, gender, experience, salary);
        Intern.education = education;
    }

    public static void displayInternInfo() 
    {
        displayDeveloperInfo();
        System.out.println("Education: " + education);
    }

    public static void main(String[] args) 
    {
        Intern intern = new Intern("Balachandra", 101, "Male", 2, 50000, "B.E");
        Intern.displayInternInfo();
    }
}