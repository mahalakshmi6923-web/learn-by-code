import java.util.Scanner;
public class fibarray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter number of terms: ");
        n = in.nextInt();
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.print("Fibonacci Series: ");
         for (int i = 0; i < n; i++){ 
           System.out.print(fib[i]+" ");
         }
    }
}