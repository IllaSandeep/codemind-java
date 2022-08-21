import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s1+=a[i];
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
            s2+=b[i];
        }
        if(s2-s1<0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(s2-s1);
        }
        
    }
}