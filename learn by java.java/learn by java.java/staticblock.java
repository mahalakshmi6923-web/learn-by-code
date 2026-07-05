import java.util.*;
class Example{
    static int count;
    static{
        count=0;
        System.out.println("static member initializzed");
    }
    Example(){
        count=count+1;
    }
    static void disp(){
        System.out.println("count="+count);
    }
}
class staticblock{
    public static void main(String[]args){
        System.out.println("driver class started");
        Example obj1=new Example();
        Example obj2=new Example();
        Example.disp();
    }
}