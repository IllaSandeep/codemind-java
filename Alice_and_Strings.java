import java.util.*;
class Solution 
{
    public static void main(String args[] ) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int p=0;p<n;p++)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            boolean res=true;
                if(str1.length()==str2.length())
                {
                    for(int i=0;i<str1.length();i++)
                    {
                        int diff = Character.compare(str2.charAt(i),str1.charAt(i));
                        if(diff>=0)
                        {
                            
                        }
                        else
                        {
                            res=false;
                            break;
                        }
        
                    }
                if(res)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        
            else
            {
                System.out.println("NO");
            }
        }
    }
}