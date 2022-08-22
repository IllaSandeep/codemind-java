import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        int avg=s/n,p=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
                System.out.println("True");
                p=1;
                break;
            }
        }
        if(p==0)
        {
            System.out.println("False");
        }
    }
}