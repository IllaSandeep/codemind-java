import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j]&&arr[i]!=-1)
                    {
                        count++;
                        arr[j]=-1;
                    }
                }
            }
            if(count==k)
            {
                System.out.format("%d ",arr[i]);
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}
