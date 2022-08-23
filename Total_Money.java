import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int p=0;p<x;p++)
        {
            long D,d,P,Q;
            D=sc.nextLong();
            d=sc.nextLong();
            P=sc.nextLong();
            Q=sc.nextLong();
            long  sum=0,n,q;
            n=D/d;
            q=D%d;
            for(int i=0;i<n;i++)
            {
                sum+=(P+(Q)*i)*d;
            }
            sum+=(P+(Q)*n)*q;
            System.out.println(sum);
        }
    }
}