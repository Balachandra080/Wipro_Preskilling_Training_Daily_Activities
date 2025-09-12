public class Batch 
{
    String code;
    Course[] courses;
    Trainer trainer;
    Student[] students;

    public Batch(String code, Course[] courses, Trainer trainer, Student[] students) 
    {
        this.code = code;
        this.courses = courses;
        this.trainer = trainer;
        this.students = students;
    }

    public void Details() 
    {
        System.out.println("Batch Code: " + code);

        System.out.println("Courses in Batch:");
        for (Course course : courses) 
        {
            System.out.println(" - " + course.name + " (" + course.code + ")");
        }

        System.out.println("\nTrainer:");
        System.out.println(" Name: " + trainer.name + ", Age: " + trainer.age + ", Emp Code: " + trainer.empCode);

        System.out.println("\nStudents:");
        for (Student student : students) 
        {
            System.out.println(" Name: " + student.name + ", Age: " + student.age + ", Student Code: " + student.studentCode);
        }
    }

    public static void main(String[] args) {
        Course[] courses = 
        {
            new Course("Java Basics", "C101"),
            new Course("OOP Concepts", "C102")
        };

        Trainer trainer = new Trainer("Kushbu", 35, "T567");

        Student[] students = {
            new Student("Raj", 21, "S001"),
            new Student("Priya", 22, "S002")
        };

        Batch batch = new Batch("B2024-Java", courses, trainer, students);
        batch.Details();
    }
}
