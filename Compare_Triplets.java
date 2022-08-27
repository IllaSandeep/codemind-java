import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
         int c=0,s=0;
    for(int i=0;i<3;i++)
    {
        if(a[i]>b[i])
        {
            c++;
        }
        else if(b[i]>a[i])
        {
            s++;
        }
    }
        System.out.printf("%d %d",c,s);
    }
}