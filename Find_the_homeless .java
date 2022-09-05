import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int c,c1=0;
        for(int i=0;i<n;i++)
        {
            c=1;
            for(int j=0;j<n;j++)
            {
                if(a[i]<=b[j])
                {
                    b[j]=0;
                    c=0;
                    break;
                }
            }
            if(c!=0)
            {
                c1++;
            }
        }
        System.out.println(c1);
    }
}