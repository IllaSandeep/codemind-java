import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=n;i>=1;i--)
        {
          for(j=1;j<i;j++)
          {
              System.out.printf(" ");
          }
          for(k=1;k<=n;k++)
          {
              if(i==1||i==n||k==1||k==n)
              {
                 System.out.printf("*");
              }
              else
              {
                  System.out.printf(" ");
              }
          }
          System.out.printf("
");
        }
    }
}