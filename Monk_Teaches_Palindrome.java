import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int p=0;p<n;p++)
        {
            String s=sc.next();
            String s1="";
            for(int i=s.length()-1;i>=0;i--)
            {
                s1+=s.charAt(i);
            }
            if(s1.equals(s))
            {
                if(s.length()%2==0)
                {
                    System.out.println("YES EVEN");   
                }
                if(s.length()%2!=0)
                {
                    System.out.println("YES ODD");
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}