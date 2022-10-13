import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int[] a=new int[26];
        for(int i=0;i<s2.length();i++)
        {
            a[s2.charAt(i)-'a']++;
        }
        int f=0;
        for(int i=0;i<s1.length();i++)
        {
            if(--a[s1.charAt(i)-'a']<0)
            {
              f=1;
                System.out.println("False");
            }
        }
        if(f==0)
        {
          System.out.println("True");
        }
    }
}