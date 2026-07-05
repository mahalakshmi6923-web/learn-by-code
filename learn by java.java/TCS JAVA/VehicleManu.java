import java.util.Scanner;
public class VehicleManu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            if(w % 2 != 0 || w < 2*v || w > 4*v) {
                System.out.println(-1);
            }
            else {
                int four = (w - 2*v) / 2;
                int two = v - four;
                System.out.println(two + " " + four);
            }
        }
    }
}