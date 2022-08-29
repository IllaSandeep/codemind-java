import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        if(s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                {
                    c++;
                }
            }
            System.out.println(c+1);
        }
        else
        {
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}