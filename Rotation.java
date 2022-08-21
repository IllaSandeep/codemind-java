import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int p=0;p<x;p++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                int k=a[n-1];
                for(int j=n-1;j>0;j--)
                {
                    a[j]=a[j-1];
                }
                a[0]=k;
            }
            for(int i=0;i<n-1;i++)
            {
                System.out.format("%d ",a[i]);
            }
            System.out.format("%d
",a[n-1]);
        }
    }
}