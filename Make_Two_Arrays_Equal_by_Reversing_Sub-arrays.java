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
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++)
        {
            b[j]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int c=0;
        for(int k=0;k<m;k++)
        {
            if(a[k]==b[k])
            {
                c++;
            }
        }
        if(c==m)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}