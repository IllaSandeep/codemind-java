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
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int p=a[0],temp;
            a[0]=a[n-1];
            for(int j=1;j<n;j++)
            {
                temp=a[j];
                a[j]=p;
                p=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.format("%d ",a[i]);
        }
    }
}