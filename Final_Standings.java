import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int n,k;
       n=sc.nextInt();
       k=sc.nextInt();
       int[] arr=new int[n+1];
       for(int i=0;i<n+1;i++)
       {
           arr[i]=0;
       }
       arr[0]=1;
       arr[1]=k-1;
       for(int i=2;i<n+1;i++)
       {
            arr[i] = (k-1)*(arr[i-1]+arr[i-2]);
       }
       System.out.format("%d",arr[n]);
    }
}