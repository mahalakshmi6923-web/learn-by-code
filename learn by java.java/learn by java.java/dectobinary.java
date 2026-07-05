import java.util.*;
    public class dectobinary {
        public static void main(String[]args){
            Scanner in=new Scanner(System.in);
            int rem,dec;
            String bi=" ";
            dec=in.nextInt();
            while(dec>0){
                rem=dec%2;
                bi=bi+rem;
                dec=dec/2;
            }
            System.out.println("Binary number:"+bi);
        }
    }
