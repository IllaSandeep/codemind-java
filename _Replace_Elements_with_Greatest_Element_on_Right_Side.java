import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int max=0;
            for(int j=i+1;j<n;j++)
            {
                if(max<a[j])
                {
                    max=a[j];
                }
            }
            System.out.format("%d ",max);
        }
        System.out.format("-1");
    }
}