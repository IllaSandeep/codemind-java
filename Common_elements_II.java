import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                   c=1;
                }
            }
            if(c==0)
            {
                l.add(a[i]);
            }
        }
         for(int i=0;i<m;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                   c=1;
                }
            }
            if(c==0)
            {
                l.add(b[i]);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.printf("%d ",l.get(i));
        }
    }
}