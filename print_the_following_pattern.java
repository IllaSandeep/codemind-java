import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                {
                    System.out.printf("x");
                }
                else
                {
                    System.out.printf("0");
                }
            }
            System.out.println();
        }
    }
}