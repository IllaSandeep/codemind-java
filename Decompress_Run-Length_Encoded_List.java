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
        int f,v;
        for(int i=0;i<n;i+=2)
        {
            f=a[i];
            v=a[i+1];
            for(int j=0;j<f;j++)
            {
                System.out.format("%d ",v);
            }
        }
        
    }
}