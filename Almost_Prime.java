import java.util.*;
class Solution
{
    public static int prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        for(int i=2;i<(n);i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int f=0;
        for(int l=0;l<x;l++)
        {
            int n=sc.nextInt();
            f=0;
            for(int i=1;i<n+1;i++)
            {
                if(prime(i)==1)
                {
                    for(int j=1;j<n+1;j++)
                    {
                        if(prime(j)==1)
                        {
                            if(i*j==n && i!=j)
                            {
                                System.out.println("YES");
                                f=1;
                                break;
                            }
                        }
                    }
                }
                if(f==1)
                {
                    break;
                }
            }
            if(f==0)
            {
                System.out.println("NO");
            }
        }
    }
}