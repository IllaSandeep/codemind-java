import java.util.*;
class Solution
{
    static int max=Integer.MIN_VALUE;
    static String res="";
    static void count(String s,int l,int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        if(r-l-1>max)
        {
            res=s.substring(l+1,r);
            max=r-l-1;
        }
    }
    static void pal(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            count(s,i,i);
            count(s,i,i+1);
        }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()==1)
        {
            System.out.println(s);
        }
        else
        {
            pal(s);
        }
    }
}