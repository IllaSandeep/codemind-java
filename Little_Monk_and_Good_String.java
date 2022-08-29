import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0,c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                c++;
            }
            else
            {
                if(c1<c)
                {
                    c1=c;
                }
                c=0;
            }
        }
        if(c1<c)
        {
            c1=c;
        }
        System.out.println(c1);
    }
}