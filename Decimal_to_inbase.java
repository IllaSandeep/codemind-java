import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,res=0,once=0,a,max=0,count=0;
        n=sc.nextInt();
        d=sc.nextInt();
    while(n!=0)
    {
        a=n%d;
        n=n/d;
        if(a==0)
        {
            once=1;
            res++;
            count=res;
        }
        else
        {
            if(count>max)
            {
                max=count;
            }
            res=0;
        }
    }
    if(once==0)
    {
        System.out.printf("-1");
    }
    else
    {
        System.out.printf("%d",count);
    }
    }
}