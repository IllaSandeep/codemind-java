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
        int c=0,c1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
            }
            else
            {
                c1++;
            }
        }
        System.out.printf("%d %d",c,c1);
    }
}