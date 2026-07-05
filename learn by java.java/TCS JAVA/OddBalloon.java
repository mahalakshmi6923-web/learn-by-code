import java.util.Scanner;
public class OddBalloon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.next().charAt(0);
        }
        boolean found = false;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count % 2 != 0) {
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("All are even");
        }
    }
}