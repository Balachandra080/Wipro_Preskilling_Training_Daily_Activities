public class Automobile 
{
    public String type;
    public int wheelCount;

    public Automobile(String type, int wheelCount) {
        this.type = type;
        this.wheelCount = wheelCount;
    }

    public void moveForward(){
        System.out.println(">>>>>");
    }

    public void moveBackward(){
        System.out.println(">>>>>");
    }

    public void start(){
        System.out.println("Engine starts");
    }
}