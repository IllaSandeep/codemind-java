import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=1;i<n-1;i++)
        {
            if(a[i-1]%2!=0 && a[i]%2!=0 && a[i+1]%2!=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}