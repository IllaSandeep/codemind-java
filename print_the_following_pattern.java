import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j==1 ||i==j ||i==n)
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