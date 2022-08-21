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
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>i)
                {
                    if(a[i]!=0)
                    {
                        if(a[j]!=0)
                        {
                            if(a[i]==a[j])
                            {
                                a[i]=0;
                                a[j]=0;
                                c++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}