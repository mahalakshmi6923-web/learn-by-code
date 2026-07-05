import java.util.Scanner;
public class FitTrainee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] < 1 || arr[i][j] > 100) {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }
        int avg[] = new int[3];
        for(int j = 0; j < 3; j++) {
            int sum = 0;
            for(int i = 0; i < 3; i++) {
                sum += arr[i][j];
            }

            avg[j] = Math.round(sum / 3);
        }
        int max = avg[0];
        for(int i = 1; i < 3; i++) {
            if(avg[i] > max) {
                max = avg[i];
            }
        }
        if(max < 70) {
            System.out.println("All trainees are unfit");
            return;
        }
        for(int i = 0; i < 3; i++) {
            if(avg[i] == max) {
                System.out.println("Trainee Number : " + (i+1));
            }
        }
    }
}