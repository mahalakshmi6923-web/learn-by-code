import java.util.Scanner;
public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int totalSum = 0;
        for(int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i = 0; i < n; i++) {
            totalSum = totalSum - arr[i];
            if(leftSum == totalSum) {
                System.out.println(i);
                return;
            }
            leftSum = leftSum + arr[i];
        }
        System.out.println(-1);
    }
}