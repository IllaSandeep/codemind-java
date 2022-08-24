import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long n=sc.nextLong();
        long l=n/s.length();
        long a=n%s.length();
        long c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                c++;
            }
        }
        long b=c*l;
        for(int i=0;i<a;i++)
        {
            if(s.charAt(i)=='a')
            {
                b++;
            }
        }
        System.out.println(b);
    }
}