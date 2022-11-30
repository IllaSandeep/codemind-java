import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextInt();
            long r=sc.nextInt();
            long k=sc.nextInt();
            long c=sc.nextInt();
            long l=1,h=n;
            while(l<=h)
            {
                long m=(l+h)/2;
                long R=n-m;
                long N=r+R*k;
                if(m*c<=N)
                {
                    l=m+1;
                }
                else
                {
                    h=m-1;
                }
            }
            System.out.println(h);
        }
    }
}