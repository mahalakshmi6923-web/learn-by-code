import java.util.*;
public class diagonalprint{
	public static void main(String[] args) {
		int[][]matrix= {
		    {1,2,3},
		    {4,5,6,},
		    {7,8,9,} };
		    int row=matrix.length;
		    int col=matrix[0].length;
		    for(int d=0;d<row+col-1;d++){
		        if(d%2==0){
		            int r=(d<row)?d:row-1;
		            int c=d-r;
		            while(r>=0&&c<col){
		                System.out.print(matrix[r][c]+" ");
		                r--;
		                c++;
		            }
		            System.out.println();
				}
		             else{
		                 int c=(d<col)?d:col-1;
		            int r=d-c;
		            while(c>=0&&r<row){
		             System.out.print(matrix[r][c]+" ");
		             r++;
		             c--;
					}
		    System.out.println();
				}
		}
	}
}