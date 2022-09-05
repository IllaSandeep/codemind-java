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
        Arrays.sort(a);
        if(n%2!=0)
        {
            for(int i=n-1;i>=1;i-=2)
            {
                if(i==2)
                {
                    System.out.printf("%d %d ",a[i-1],a[i]);
                }
                else
                {
                    System.out.printf("%d %d ",a[i-1],a[i]);
                }
            }
            System.out.printf("%d",a[0]);
        }
        else
        {
            for(int i=n-1;i>=0;i-=2)
            {
                System.out.printf("%d %d ",a[i-1],a[i]);
            }
        }
    }
}