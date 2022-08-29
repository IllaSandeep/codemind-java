import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                int n=s.charAt(i)-48;
                if(n%2!=0)
                {
                    System.out.printf("%d",n*n);
                }
            }
        }
    }
}