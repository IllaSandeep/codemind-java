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
        int k=0,ste=0,end=0;
        for(int i=0;i<n;i++)
        {
            int se=0,ee=0;
            for(int j=i;j<n;j++)
            {
                if(a[j]==0)
                {
                    se++;
                }
                else if(a[j]==1)
                {
                    ee++;
                }
                if(se==ee)
                {
                    if(k<j-i)
                    {
                        k=j-i;
                        ste=i;
                        end=j;
                    }
                }
            }
        }
        if(k==0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.printf("%d %d",ste,end);
        }
    }
}