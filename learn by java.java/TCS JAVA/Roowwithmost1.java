import java.util.Scanner;
public class Roowwithmost1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int maxCount = 0;
        int rowIndex = -1;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < m;j++) {
                if(matrix[i][j] == 1) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }
        if(maxCount == 0)
            System.out.println(-1);
        else
            System.out.println(rowIndex);
    }
}