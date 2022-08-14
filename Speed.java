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
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n-1;i++)
            {
                if(a[i+1]<a[i])
                {
                    c++;
                }
            }
            System.out.println(c+1);
        }
    }
}