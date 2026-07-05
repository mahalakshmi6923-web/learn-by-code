import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int total = 0;
        for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            for(int j = 0; j < str1.length(); j++) {
                if(str1.charAt(j) == ch) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}