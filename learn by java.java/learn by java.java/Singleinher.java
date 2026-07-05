import java.util.*;
class A{
    int a,b;
    public void getdata(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }
}
public class Singleinher extends A {
    int c ;
    public void Singleinher(){
    c=a+b;
    System.out.println("Sum="+c);
    }
    public static void main(String[]args){
        Singleinher obj=new Singleinher();
        obj.getdata();
        obj.Singleinher();
    }
}
