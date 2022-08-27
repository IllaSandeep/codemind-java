import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int p=0;p<x;p++)
        {
            int m,n ;
            n=sc.nextInt();
            m=sc.nextInt();
            int[] a=new int[m+n];
            for(int i=0;i<m+n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<m+n;i++)
            {
                if(i<m+n-1)
                {
                    System.out.format("%d ",a[i]);
                }
                else
                {
                    System.out.format("%d",a[i]);
                }
            }
            System.out.printf("
");
            
        }
    }
}