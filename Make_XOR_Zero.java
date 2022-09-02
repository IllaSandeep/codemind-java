import java.util.*;
class Solution
{
    public static int xored(int a[],int data,int add,int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            res^=((a[i]+data)&add);
        }
        return res;
    }
    public static int solve(int a[],int n)
    {
        int add=1,res=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        int xr=0;
        while(add<=max)
        {
            xr=xored(a,res,add,n);
            if(xr!=0)
            {
                res+=add;
            }
            add+=1;
        }
        xr=0;
        for(int i=0;i<n;i++)
        {
            xr^=(a[i]+res);
        }
        if(xr==0)
        {
            return res;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(solve(a,n));
    }
}