public class Car extends Automobile {

    private String color;

    public Car(String color, String type, int wheelCount) {
        super(type, wheelCount);
        this.color = color;
    }

    public void switchOnAc () {
        System.out.println("AC is On");
        }

    public static void main(String[] args) {
        Car c1 = new Car("Red", "SUV", 4);

        System.out.println("Type :" + c1.type);
        System.out.println("wheelCount:" + c1.wheelCount);
        c1.switchOnAc();

        c1.start();
        c1.moveForward();
    }

    
}
