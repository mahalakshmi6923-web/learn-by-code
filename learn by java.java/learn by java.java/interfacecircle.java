interface Circle{
    double pai=3.14;
    public void calc();
}
class Area implements Circle{
    double r,area;
    Area(double r){
        this.r=r;
    }
    public void calc(){
        area=pai*r*r;
        System.out.println("Area="+area);
    }
} class interfacecircle{
    public static void main(String[]args){
       Area obj =new Area(10);
       obj.calc();
    }
}