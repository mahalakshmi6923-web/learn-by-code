import java.util.Scanner;
public class CandyJar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 10;  
        int K = 5; 
        int candies = N;
        int order = in.nextInt();
        if(order > candies) {
            System.out.println("INVALID INPUT");
        }
        else {
            candies = candies - order;
            System.out.println("NUMBER OF CANDIES SOLD : " + order);
            System.out.println("NUMBER OF CANDIES LEFT : " + candies);

            if(candies <= K) {
                candies = N;  
            }
        }
    }
}