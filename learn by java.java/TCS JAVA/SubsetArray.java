import java.util.Scanner;
public class SubsetArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int a[] = new int[m];
        for(int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }
        int n = in.nextInt();
        int b[] = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        boolean subset = true;
        for(int i = 0; i < n; i++) {
            boolean found = false;
            for(int j = 0; j < m; j++) {
                if(b[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                subset = false;
                break;
            }
        }
        if(subset)
            System.out.println("true");
        else
            System.out.println("false");
    }
}