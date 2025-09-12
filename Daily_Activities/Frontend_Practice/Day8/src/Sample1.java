public class Sample1 {

    public void divide(int a,int b){
        try{
          System.out.println("Q"+a/b);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
    }
    public void divide2(int a,int b) throws ArithmeticException {
        System.out.println(a/b);
    }
    public void divide3(int a,int b){
        if(b==0){
            throw new ArithmeticException("not possible");
        }
    }

    public static void main(String[] args) {
        Sample1 s1=new Sample1();
        try{
            s1.divide3(25,0);
        }catch(ArithmeticException ex){
            System.out.println("erroe"+ex.getMessage());
        }
    }


}
