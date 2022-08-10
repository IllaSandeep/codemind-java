import java.util.*;
class Solution 
{
    boolean perf(int n)
    {
        for(int i=0;i*i<=n;i++)
        {
            if(i*i==n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        Solution s=new Solution();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(s.perf(a[i]))
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
        
    }
}