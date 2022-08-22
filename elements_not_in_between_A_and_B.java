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
        int x=sc.nextInt();
        int y=sc.nextInt();
        int s=0,ms=0;
        for(int i=0;i<n;i++)
        {
            if(!(a[i]>=x && a[i]<=y))
            {
               System.out.format("%d ",a[i]);
               s++;
            }
        }
        if(s==0)
        {
            System.out.println("-1");
        }        
    }
}