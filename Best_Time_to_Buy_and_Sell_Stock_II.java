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
        int x=0;
        for(int i=1;i<n;i++)
        {
           if(0<a[i]-a[i-1])
           {
               x=x+a[i]-a[i-1];
           }
        }
        System.out.println(x);
    }
}