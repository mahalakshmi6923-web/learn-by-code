abstract class Shape{
    double area;
    abstract public void calc();
}
class Circle extends Shape {
    double r;
    Circle(double r){
        this.r=r;
    }
    public void calc(){
       double area=3.14*r*r;
        System.out.println("Area="+area);
    }
}
class abstractexample{
    public static void main(String[]args){
        Circle c=new Circle(8.3);
        c.calc();
    }
}
