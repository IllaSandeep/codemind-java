import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            set.add(a[i]);
        }
        int x=set.size();
        while(x-->0)
        {
            int c=0,min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                if(min>a[i] && a[i]>0)
                {
                    min=a[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]>=min)
                {
                    c++;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]==min)
                {
                    a[i]=-1;
                }
            }
            System.out.println(c);
        }
    }
}