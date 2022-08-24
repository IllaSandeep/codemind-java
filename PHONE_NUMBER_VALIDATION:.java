import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long i=0;
        int c=0;
        while(n!=0)
        {
            i=n%10;
            n=n/10;
            c++;
        }
        if(c==10)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}