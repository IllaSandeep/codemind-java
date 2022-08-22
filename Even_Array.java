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
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                f++;
            }
        }
        if(f==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}