import java.util.Scanner;
public class BorderSum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int m = sc.nextInt();
        System.out.println("Enter columns:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == m-1 || j == 0 || j == n-1) {
                    sum += arr[i][j];
                }
            }
        }
         System.out.println("Sum of border elements: " + sum);
    }
}
