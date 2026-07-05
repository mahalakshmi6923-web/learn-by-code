import java.util.Scanner;
public class CruiseParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int E[] = new int[t];
        int L[] = new int[t];
        for(int i = 0; i < t; i++) {
            E[i] = in.nextInt();
        }
        for(int i = 0; i < t; i++) {
            L[i] = in.nextInt();
        }
        int currentGuests = 0;
        int maxGuests = 0;
        for(int i = 0; i < t; i++) {
            currentGuests = currentGuests + E[i] - L[i];

            if(currentGuests > maxGuests) {
                maxGuests = currentGuests;
            }
        }
        System.out.println(maxGuests);
    }
}
