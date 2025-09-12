public class Animal 
{
    public Animal makeAnimal(String type) 
    {
        if(type.equals("cat"))
        {
            return new Cat();
        }
        else if(type.equals("dog"))
        {
            return new Dog();
        }
        else if(type.equals("cow"))
        {
            return new Cow();
        }
        else 
        {
            return null;
        }
    }
}
