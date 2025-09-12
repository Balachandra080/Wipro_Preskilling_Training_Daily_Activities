public class Sample2 {
    public void checkAge(int age) throws MyOwnexception{
        if (age<18){
            throw new MyOwnexception("age is less than 18");
        }
    }

    public static void main(String[] args) {
        Sample2 s2=new Sample2();
        try{
            s2.checkAge(15);
        }
        catch(MyOwnexception ex){
            System.out.println("error"+ex.getMessage());
        }
    }

}
