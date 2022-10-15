import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            HashSet<Integer> set =new HashSet<>();
            int x=sc.nextInt();
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            int[] b=new int[m];
            int p=n;
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }
            int[] ans=new int[n+m];
            for(int i=0;i<n;i++)
            {
                ans[i]=a[i];
            }
            for(int i=0;i<m;i++)
            {
                ans[p++]=b[i];
            }
            for(int i=0;i<n+m;i++)
            {
                set.add(ans[i]);
            }
            if(set.size()>=x)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
        }
    }
}