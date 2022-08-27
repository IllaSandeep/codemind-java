import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                c++;
            }
        }
        System.out.println(c);
    }
}