import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int k=0;k<x;k++)
        {
        int n=sc.nextInt();
        int[] a=new int[n];
        int s=0;
        for(int i=0;i<n-1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            s=s+a[i];
        }
        int tot=n*(n+1)/2;
        System.out.println(tot-s);
        }
            
    }
}