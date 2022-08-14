import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l,p;
        for(int i=0;i<k;i++)
        {
            l=a[0];
            for(int j=0;j<n-1;j++)
            {
                p=a[j+1];
                a[j]=p;
            }
            a[n-1]=l;
        }
        for(int i=0;i<n;i++)
        {
            System.out.format("%d ",a[i]);
        }
    }
}