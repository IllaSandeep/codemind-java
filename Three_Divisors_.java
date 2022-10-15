import java.util.*;
class Solution
{
    public static int prime(int n)
    {
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<(int)Math.sqrt(n)+1;i++)
        {
            if(prime(i)==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}