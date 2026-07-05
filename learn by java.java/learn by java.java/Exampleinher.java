import java.util.*;
class A{
    protected int a;
    public void getdata(){
        Scanner in= new Scanner(System.in);
        a=in.nextInt();
    }
}
    class B extends A{
        int b;
        public void getdata(){
            super.getdata();
            Scanner in =new Scanner(System.in);
            b=in.nextInt();
        }
    }
public class Exampleinher {
    int c;
    public void sum(B obj){
        c=obj.a +obj.b;
        System.out.println("Sum="+c);
    }
    public static void main (String[]args){
        Exampleinher obj=new Exampleinher();
        B objb = new B();
        objb.getdata();
        obj.sum(objb);
    }
}
