public class Home 
{
    public static void main(String[] args) 
    {
        Animal a1 = new Animal();

        Animal cat = a1.makeAnimal("cat");
        Animal dog = a1.makeAnimal("dog");
        Animal tiger = a1.makeAnimal("tiger");
        if(tiger == null)
        {
            System.out.println("No tiger animal found");
        }
    }
}
