import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();

        names.add("sai");
        names.add("sai");
        names.add("king");
        names.add("Queen");
        names.add(null);

        System.out.println(names);

        names.remove("sai");
        System.out.println(names);

        System.out.println(names.size());

        names.clear();
    }

}
