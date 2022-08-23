import java.util.*;
class Solution
{
    public static int fib(int n)
    {
        int a=0,b=1;
        int c=a+b;
        while(c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int k=0,g=0;
        for(int i=n;i>0;i--)
        {
            if(fib(i)==1)
            {
                k=i;
                break;
            }
        }
        while(temp!=0)
        {
            if(fib(temp)==1)
            {
                g=temp;
                break;
            }
            temp+=1;
        }
        if((n-k)<(g-n))
        {
            System.out.println(k);
        }
        else if((n-k)==(g-n))
        {
            System.out.printf("%d %d",k,g);
        }
        else
        {
                System.out.println(g);
        }
    }
}