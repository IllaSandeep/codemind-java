import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int x=sc.nextInt();
            String s=sc.next();
            int c=0;
            for(int i=0;i<x;i++)
            {
                for(int j=i;j<x;j++)
                {
                    if(s.charAt(i)=='1' && s.charAt(j)=='1')
                    {
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}