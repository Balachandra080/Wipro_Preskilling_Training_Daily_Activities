public class Intern implements Human{

public void eat(){
    System.out.println("eating");
}

    public String name(){
        return "myname";
    }

    public int add(int a,int b){
        return(a+b);
    }


    public static void main(String args[]){
        Intern i=new Intern();
        System.out.println(i.add(5, 10));
        
    }
}
