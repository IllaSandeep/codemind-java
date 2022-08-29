import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,sp=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U')
            {
             v+=1;   
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                d+=1;
            }
            else if(s.charAt(i)==' ')
            {
                sp+=1;
            }
            else
            {
                c+=1;
            }
        }
        System.out.printf("Vowels: %d
",v);
        System.out.printf("Consonants: %d
",c);
        System.out.printf("Digits: %d
",d);
        System.out.printf("White spaces: %d
",sp);
    }
}