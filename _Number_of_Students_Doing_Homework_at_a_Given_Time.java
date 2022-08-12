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
        int m;
        m=sc.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++)
        {
            b[j]=sc.nextInt();
        }
        int k;
        k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=k && b[i]>=k)
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}