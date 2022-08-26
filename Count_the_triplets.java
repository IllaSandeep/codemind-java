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
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        if(i!=j && j!=k)
                        {
                            if(a[j]+a[k]==a[i])
                            {
                                c++;
                            }
                        }
                    }
                }
            }
            if(c==0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(c/2);
            }
        }
    }
}