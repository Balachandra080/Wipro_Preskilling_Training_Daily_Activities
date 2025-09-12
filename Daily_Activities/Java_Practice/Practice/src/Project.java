public class Project 
{
    public String code;
    public Skill[] skills;
    public Employee[] employees;
    public Employee manager; 

    public Project(String code, Skill[] skills, Employee[] employees, Employee manager) 
    {
        this.code = code;
        this.skills = skills;
        this.employees = employees;
        this.manager = manager;
    }

    public void printDetails() 
    {
        System.out.println("Project Code: " + code);

        System.out.println("Mandatory Skills:");
        for (Skill skill : skills) 
        {
            System.out.println(" " + skill.name);
        }

        System.out.println("Manager:");
        System.out.println(" Name: " + manager.name + ", Employee Number: " + manager.empNumber + ", Gender: " + manager.gender);

        System.out.println("Employees:");
        for (Employee employee : employees) 
        {
            System.out.println(" Name: " + employee.name + ", Employee Number: " + employee.empNumber + ", Gender: " + employee.gender);
        }
    }

    public static void main(String[] args) 
    {
        Skill[] skills = 
        {
            new Skill("Java"),
            new Skill("Spring Boot")
        };

        Employee manager = new Employee("Alice", 999, "Female");  

        Employee[] employees = 
        {
        new Employee("John", 123, "Male"),
            new Employee("Jahnavi", 102, "Female")
        };

        Project project = new Project("TY56474", skills, employees, manager);
        project.printDetails();
    }
}
