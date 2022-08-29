import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int u=sc.nextInt();
        for(int o=0;o<u;o++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int c=0,s=0,f=0,x=0,y=0;
            for(int i=0;i<n;i++)
            {
                s=0;
                for(int j=i;j<n;j++)
                {
                    s=s+a[j];
                    if(s==m)
                    {
                     x=i+1;
                     y=j+1;
                     c=1;
                     f=1;
                     break;
                    }
                }
                if(c==1)
                {
                    break;
                }
            }
            if(c==1)
            {
                System.out.printf("%d %d
",x,y);
            }
            if(f==0)
            {
                System.out.printf("-1
");
            }
        }
    }
}