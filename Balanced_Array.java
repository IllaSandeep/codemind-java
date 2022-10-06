import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int p=0;p<t;p++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int ls=0,rs=0;
            int f=0;
            for(int i=0;i<n;i++)
            {
                ls=0;
                for(int j=i-1;j>=0;j--)
                {
                    ls+=a[j];   
                }
                rs=0;
                for(int k=i+1;k<n;k++)
                {
                    rs+=a[k];
                }
                if(ls==rs)
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
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
