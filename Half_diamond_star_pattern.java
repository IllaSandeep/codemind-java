import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        if(n>=3&&n<=100)
        {
         for(i=1;i<=n;i++)
         {
            for(int k=1;k<=i;k++)
            {
             System.out.printf("*");
            }
           System.out.printf("
");
         }
         for(j=n-1;j>=1;j--)
         {
            for(int l=j;l>=1;l--)
            {
               System.out.printf("*");
            }
            System.out.printf("
");
         }
        }
        else
        {
            System.out.printf("The pattern is not possible");
        }
    }
}