import java.util.*;
public class dectohexa {
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int dec,rem;
    System.out.println("Enter the decimal number:");
    dec=in.nextInt();
    String hex=" ";
    while(dec>0){
        rem=dec%16;
        if(rem<10)
            hex=rem+hex;
        else if(rem>=10)
        {
            hex=(char)((rem-10)+'A')+hex;
        }
        dec=dec/16;
    }
    System.out.println(hex);
}
}
