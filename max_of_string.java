import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char max=0;
        for(int i=0;i<s.length();i++)
        {
            if(max<s.charAt(i))
            {
                max=s.charAt(i);
            }
        }
        System.out.println(max);
    }
}