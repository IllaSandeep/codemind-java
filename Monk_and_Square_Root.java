import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int p=0;p<n;p++)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            int c=0;
            for(int i=0;i<b+1;i++)
            {
                long temp=(long)i*i;
                if((temp)%b==a)
                {
                    System.out.println(i);
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(-1);
            }
        }
    }
}