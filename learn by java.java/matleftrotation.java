import java.util.Scanner;
public class matleftrotation{
    public static void leftrotation(int[] row,int k){
        int n=row.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=row[i];
        }
        for(int i=k;i<n;i++){
            row[i-k]=row[i];
        }
        for(int i=0;i<k;i++){
            row[n-k+i]=temp[i];
        }
    }
        public static void main(String []args){
        int n;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the length of the array:");
        n=in.nextInt();
        int[][] a=new int[n][n];
         System.out.println(" enter the numbers for matrix array");
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
         }
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 System.out.print(a[i][j]+" ");
             }
             System.out.println(" ");
         }
         for(int i=0;i<a.length;i++){
             leftrotation(a[i],i);
         }
         System.out.println("After the rotation");
         for(int i=0;i<a[i].length;i++){
             for(int j=0;j<a.length;j++){
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
             }
        }
}