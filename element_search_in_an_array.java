import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                c=1;
            }
        }
        if(c==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}