import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s1.length()==0)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' ||  s.charAt(i)=='i' ||  s.charAt(i)=='o' ||  s.charAt(i)=='u' ||  s.charAt(i)=='A' ||  s.charAt(i)=='E' || s.charAt(i)=='O' || s.charAt(i)=='I' || s.charAt(i)=='U' ) 
                {
                    s1+="V";
                }
                else
                {
                    s1+="C";
                }
            }
            else if(s1.charAt(s1.length()-1)=='C')
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' ||  s.charAt(i)=='i' ||  s.charAt(i)=='o' ||  s.charAt(i)=='u' ||  s.charAt(i)=='A' ||  s.charAt(i)=='E' || s.charAt(i)=='O' || s.charAt(i)=='I' || s.charAt(i)=='U' ) 
                {
                    s1+="V";
                }
            }
            else if(s1.charAt(s1.length()-1)=='V')
            {
                if(s.charAt(i)!='a' || s.charAt(i)!='e' ||  s.charAt(i)!='i' ||  s.charAt(i)!='o' ||  s.charAt(i)!='u' ||  s.charAt(i)!='A' ||  s.charAt(i)!='E' || s.charAt(i)!='O' || s.charAt(i)!='I' || s.charAt(i)!='U'  )
                {
                  s1+="C";  
                }
            }
        }
        System.out.print(s1);
    }
}