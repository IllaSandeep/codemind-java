import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(i==j || i==n+1-j)
                {
                    System.out.printf("%d ",n-i+1);
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}