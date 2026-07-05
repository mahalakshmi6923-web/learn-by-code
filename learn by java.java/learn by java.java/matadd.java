import java.util.Scanner;
public class matadd {
    public static void main(String []args)
    {
        int n;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the length of the array:");
        n=in.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int[][] result=new int[n][n];
         System.out.println(" enter the numbers for first array");
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
         }
         System.out.println(" enter the numbers for second array");
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                b[i][j]=in.nextInt();
            }
         }
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                result[i][j]=a[i][j]+b[i][j];
            }
         }
         System.out.println("Addiyion matrix");
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
             System.out.print(result[i][j]+" ");
            }
            System.out.println();
         }
        }
    }