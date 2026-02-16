import java.util.*;
public class twodim
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int rows=in.nextInt();
	    int cols=in.nextInt();
	    int[][] a=new int[rows][cols];
	    System.out.print("enter elements");
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            a[i][j]=in.nextInt();
	        }
	    }
	            System.out.println("matrix");
	            for(int i=0;i<a.length;i++){
	                for(int j=0;j<a[i].length;j++){
	                    System.out.print(a[i][j]+" ");
	                }
	                System.out.println();
	            }
	            
	}
}