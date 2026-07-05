import java.util.*;
class shape{
    double area;
} class circle extends shape{
    double r;
    public void cir(){
        Scanner in=new Scanner(System.in);
        r=in.nextDouble();
        area=3.14*r*r;
        System.out.println("Area odf circle:"+area);
    }
}class square extends shape{
    double a;
    public void squ(){
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        area=a*a;
        System.out.println("Area of square:"+area);
    }
}class reactangle extends shape{
    double b,h;
    public void rea(){
       Scanner in=new Scanner(System.in);
       b=in.nextDouble();
       h=in.nextDouble();
       area=b*h;
       System.out.println("Area of reactangle:"+area);
    }
}class areainher{
    public static void main(String[] args){
        circle obj1=new circle();
        square obj2=new square();
        reactangle obj3=new reactangle();
        obj1.cir();
        obj2.squ();
        obj3.rea();
    }
}
