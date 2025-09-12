import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<String> names=new TreeSet<>();

        names.add("zaheer");
        names.add("sai");
        names.add("ahok");
        names.add("balu");

        System.err.println(names);

        System.out.println(names.first());
        System.out.println(names.last());
    }

}
