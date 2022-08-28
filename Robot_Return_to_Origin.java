import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,u=0,d=0,r=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            {
                l++;
            }
            if(s.charAt(i)=='R')
            {
                r+=1;
            }
            if(s.charAt(i)=='U')
            {
                u+=1;
            }
            if(s.charAt(i)=='D')
            {
                d+=1;
            }
        }
        if(u==d && l==r)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}