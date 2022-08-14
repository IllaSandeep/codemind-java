import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0,flag=0;
        for(int i=0;i<n;i++)
        {
            if(flag==1 && a[i]>k)
            {
                break;
            }
            if(a[i]>k)
            {
                flag=1;
            }
            else
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}