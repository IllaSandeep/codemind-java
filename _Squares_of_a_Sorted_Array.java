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
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                a[i]=a[i]*-1;
            }
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",a[i]*a[i]);
        }
    }
}