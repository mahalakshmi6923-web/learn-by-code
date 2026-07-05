import java.util.*;
public class binaryadd {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String a,b;
        System.out.println("Enetr the a:");
        a=in.nextLine();
        System.out.println("Enter the b:");
        b=in.nextLine();
        int n1=a.length()-1;
        int n2=b.length()-1;
        int num=0;
        int carry=0;
        String add=" ";
        while(n1>=0||n2>0||carry==1){
            num=0;
            if(n1>=0 && n2>=0){
                num=(a.charAt(n1)-'0')+(b.charAt(n2)-'0')+carry;
            }
            else if(n1>=0)
                num=(a.charAt(n1)-'0')+carry;
            else if(n2>=0)
                num=(b.charAt(n2)-'0')+carry;
            else
                num=carry;
            carry=num/10;
            num=num%10;
            add=num+add;
            n1--;
            n2--;
        }
        System.out.println(add);
    }
    
}
