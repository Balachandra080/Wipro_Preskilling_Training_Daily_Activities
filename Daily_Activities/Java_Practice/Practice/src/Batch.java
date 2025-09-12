public class Batch 
{
    public String name;
    public Trainer trainer;
    public Course[] courses;

    Batch(String name, Trainer trainer, Course[] courses)
    {
        this.name = name;
        this.trainer = trainer;
        this.courses = courses;
    }
}
