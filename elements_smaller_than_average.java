import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        int c=0;
        float avg=s/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=avg)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}