import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {
        HashMap<String,Integer> marks=new HashMap<>();

        marks.put("english", 90);
        marks.put("maths", 75);
        marks.put("science", 85);
        marks.put("maths", 95);

        System.out.println(marks);
        System.out.println(marks.get("maths"));

        System.out.println(marks.keySet());
        System.out.println(marks.containsKey("science"));
        marks.remove("maths");
        System.out.println(marks);
    }

}
