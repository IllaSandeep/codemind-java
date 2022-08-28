import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int b=0,l=0,a=0,o=0,n=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                b+=1;
            }
            if(s.charAt(i)=='a')
            {
                a+=1;
            }
            if(s.charAt(i)=='l')
            {
                l+=1;
            }
            if(s.charAt(i)=='o')
            {
                o+=1;
            }
            if(s.charAt(i)=='n')
            {
                n+=1;
            }
        }
        System.out.println(Math.min(b , Math.min(a , Math.min(l/2, Math.min(o/2 , n)))));
    }
}