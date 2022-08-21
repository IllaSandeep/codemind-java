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
        int s=0,s1=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                s+=a[i];
            }
            else
            {
                s1+=a[i];
            }
        }
        if((Math.abs(s-s1))%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}