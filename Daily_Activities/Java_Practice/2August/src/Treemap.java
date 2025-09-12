import java.util.*;

public class Treemap 
{
    public static void main(String[] args) 
    {

        TreeMap<Integer, String> names = new TreeMap<>();
        names.put(1, "John");
        names.put(2, "Ravi");
        names.put(3, "Balu");
        names.put(4, "Santosh");

        System.out.println(names);

        for (Map.Entry<Integer, String> temp : names.entrySet()) 
        {
            System.out.println(temp);
        }
    }
}
