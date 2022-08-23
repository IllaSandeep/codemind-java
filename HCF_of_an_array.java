import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int n,i,j,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int [n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(j=min;j>0;j--)
        {
            c=0;
            for(i=0;i<n;i++)
            {
                if(arr[i]%j==0)
                {
                    c++;
                }
            }
            if(c==n)
            {
                System.out.format("%d",j);
                break;
            }
        }
    }
}