public class Employee 
{
    public static String name;
    public static  int empNo;
    public static  String gender;

    public Employee(String name, int empNo, String gender) {
        this.name = name;
        this.empNo = empNo;
        this.gender = gender;
    }

    public static void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + empNo);
        System.out.println("Gender: " + gender);
    }
}