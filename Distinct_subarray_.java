import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=n;i<m+1;i++)
        {
            int x=0;
            for(int j=i;j<m+1;j++)
            {
                x+=j;
                if(x%2!=0)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}