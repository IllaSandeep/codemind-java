import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int c=0;
            int x=sc.nextInt();
            for(int i=0;i<x;i++)
            {
                int p=sc.nextInt();
                if(p%2!=0)
                {
                    c++;
                }
            }
            if(c%2!=0)
            {
             c--;   
            }
            System.out.format("%d
",c/2);
        }
    }
}