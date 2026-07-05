import java.util.*;
public class transposematrix
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
	    int[][] b=new int[rows][cols];
	            System.out.println("tranpose");
	            for(int i=0;i<a.length;i++){
	                for(int j=0;j<a[i].length;j++){
	                    b[i][j]=a[j][i];
                         System.out.print(b[i][j]+" ");
	                }
					System.out.println();
	            }
	}
}