import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> s = new ArrayList<>();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                f=1;
                s.add(a[i]);
            }
        }
        if(f==0)
        {
            System.out.println(-1);
        }
        else
        {
            int max;
            max = Collections. max(s);
            System.out.println(max);
        }
            
    }
}