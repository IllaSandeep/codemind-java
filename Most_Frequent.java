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
        int c=0,maxx=0,max=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(maxx==c)
            {
                maxx=c;
               if(a[i]<max)
               {
                   max=a[i];
               }
            }
            else if(c>maxx)
            {
                maxx=c;
                max=a[i];
            }
        }
        System.out.println(max);
    }
}