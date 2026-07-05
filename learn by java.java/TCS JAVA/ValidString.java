import java.util.Scanner;
public class ValidString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int star = 0;
        int hash = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                star++;
            }
            else if(s.charAt(i) == '#') {
                hash++;
            }
        }
        int result = star - hash;
        System.out.println(result);
    }
}
