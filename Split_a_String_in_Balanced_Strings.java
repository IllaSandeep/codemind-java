import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0,x=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            {
                c+=1;
            }
            if(s.charAt(i)=='R')
            {
                c-=1;
            }
            if(c==0)
            {
                x+=1;
            }
        }
        System.out.println(x);
    }
}