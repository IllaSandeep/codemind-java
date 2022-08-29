import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                System.out.printf("[%c]",s.charAt(i));
            }
            else
            {
                System.out.printf("%c",s.charAt(i));
            }
        }
    }
}