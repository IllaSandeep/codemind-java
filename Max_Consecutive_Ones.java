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
        int c=0,c1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                c++;
            }
            if(a[i]==0)
            {
                if(c>c1)
                {
                    c1=c;
                }
                c=0;
            }
        }
        if(c1<c)
        {
            c1=c;
        }
        System.out.println(c1);
    }
}