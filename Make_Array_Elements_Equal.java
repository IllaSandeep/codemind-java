import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=1,c=0,v=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]==k)
            {
                l++;
            }
        }
        if(l==n)
        {
            System.out.printf("%d",0);
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                c=0;
                for(int j=i;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        c++;
                        if(c>v)
                        {
                            v=c;
                        }
                    }
                }
            }
            System.out.println(v);
        }
    }
}