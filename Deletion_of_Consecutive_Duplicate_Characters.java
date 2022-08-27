import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            int c=0;
            for(int j=0;j<s.length()-1;j++)
            {
                if(s.charAt(j)==s.charAt(j+1))
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}