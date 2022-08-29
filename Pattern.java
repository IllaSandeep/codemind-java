import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}