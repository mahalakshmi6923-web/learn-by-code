import java.util.*;
class Circle{
    double r, area;
    public void getdata(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter r:");
        r=in.nextDouble();
    }
    public void calc(){
        double area=3.14*r*r;
        System.out.println("Area:"+area);
    }
}
class classname{
    public static void main(String[]args){
        Circle obj=new Circle();
        obj.getdata();
        obj.calc();
    }
}