import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=0,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                s=s+a[j];
                if(k==s)
                {
                    c++;
                }
                if(c>k)
                {
                    break;
                }
            }
            s=0;
        }
        System.out.println(c);
    }  
}