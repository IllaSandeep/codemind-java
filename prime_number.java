import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}