import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Float c=sc.nextFloat();
        if(a>b)
        {
            System.out.println(-1);
        }
        else
        {
            int cou=1;
            int s1=a,s2=b;
            while(c+s1>=s2)
            {
                cou++;
                s1+=a;
                s2+=b;
            }
           System.out.print(cou);
        }
         
    }
}