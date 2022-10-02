import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i = 10; i <= 26; i++) 
        {
            s = s.replaceAll(i + "#", (char)('a' + (i-1)) + "");
        }
        
        for(int i = 1; i <= 9; i++) 
        {
            s = s.replaceAll(i + "", (char)('a' + (i-1)) + "");
        }
        System.out.println(s);
    }
}