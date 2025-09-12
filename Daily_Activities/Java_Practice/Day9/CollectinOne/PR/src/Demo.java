import java.util.*;

public class Demo 
{
    public static void main(String[] args) 
    {
        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("Amit", 18, "Male", new int[]{80, 75, 90, 85, 95}));
        students.add(new Student("Sara", 19, "Female", new int[]{70, 60, 65, 75, 80}));
        students.add(new Student("John", 17, "Male", new int[]{88, 77, 66, 99, 90}));
        students.add(new Student("Priya", 18, "Female", new int[]{55, 60, 58, 62, 65}));

        for (int i = 0; i < students.size(); i++) 
        {
            Student s = students.get(i);
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Gender: " + s.gender);
            System.out.println("Total Marks: " + s.getTotal());
            System.out.println("Average Marks: " + s.getAverage());
        }
    }
}

