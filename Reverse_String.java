import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n="";
        for(int i=s.length()-1;i>=0;i--)
        {
            n+=s.charAt(i);
        }
        System.out.println(n);
    }
}