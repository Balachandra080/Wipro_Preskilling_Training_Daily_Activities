class Student 
{
    String name;
    int age;
    String gender;
    int[] marks = new int[5];

    public Student(String name, int age, String gender, int[] marks) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }

    public int getTotal() 
    {
        int sum = 0;
        for (int mark : marks) 
        {
            sum += mark;
        }
        return sum;
    }

    public double getAverage() 
    {
        return getTotal() / 5.0;
    }
}