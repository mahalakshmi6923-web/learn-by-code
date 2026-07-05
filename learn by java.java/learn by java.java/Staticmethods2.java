class Staticmethods{
    static int count=0;
    Staticmethods(){
        count=count+1;
    }
    public static void disp(){
        System.out.println("objects created:"+count);
    }
}
class staticmethods2{
    public static void main(String[]args){
        Staticmethods obj1=new Staticmethods();
        Staticmethods obj2=new Staticmethods();
        Staticmethods obj3=new Staticmethods();
        obj3.disp();
    }
}
