import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.charAt(0)=='(' && s.charAt(s.length()-1)==')')
        {
         System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}