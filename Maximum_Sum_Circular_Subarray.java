import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
         int m=-9999;
         int s,i,j,k;
    for(k=0;k<a;k++)
    {
        int ft=arr[0];
        arr[0]=arr[a-1];
        for(i=1;i<a;i++)
        {
            int temp=arr[i];
            arr[i]=ft;
            ft=temp;
        }
        for(i=0;i<a;i++)
        {
            s=0;
            for(j=i;j<a;j++)
            {
                s+=arr[j];
                if(m<s)
                {
                    m=s;
                    
                }
            }
        }
    }
    System.out.println(m);
    }
}