public class Staticmembers{
    static String college = "HICET";
    String name;
    Staticmembers(String name){
        this.name=name;
    }
    public void disp(){
        System.out.print(name + " studies@ " + college);
    }
    public static void main(String[] args){
        Staticmembers obj = new Staticmembers("maha");
        obj.disp();
    }
}