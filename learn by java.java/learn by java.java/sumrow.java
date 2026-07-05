import java.util.Scanner;
class sumrow{
    public static void main(String []args)
    {
        int n;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the length of the array:");
        n=in.nextInt();
        int[][] a=new int[n][n];
         System.out.println(" enter the numbers for first array");
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            } 
        }  int sum;
         for(int i=0;i<n;i++)
         {
            sum = 0;
            for(int j=0;j<n;j++)
            {
               sum+=a[i][j];
        }
        System.out.println(sum+" ");
        }

    }
}