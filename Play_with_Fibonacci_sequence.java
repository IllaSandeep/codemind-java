import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c;
        a=0;
        b=1;
        System.out.format("%d %d ",a,b);
        for(int i=1;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.format("%d ",c);
        }
    }
}