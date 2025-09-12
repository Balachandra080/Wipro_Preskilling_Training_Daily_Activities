public class Developer extends Employee
 {
    public static int experience;
    public static double salary;

    public Developer(String name, int empNo, String gender, int experience, double salary) 
    {
        super(name, empNo, gender);
        this.experience = experience;
        this.salary = salary;
    }

    public static void displayDeveloperInfo() 
    {
        displayInfo();
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary :" + salary);
    }
}
