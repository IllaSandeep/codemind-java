import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i*i<=n;i++)
        {
            if(i*i==n)
            {
                System.out.println("True");
                f=0;
                break;
            }
        }
        if(f!=0)
        {
            System.out.println("False");
        }
       
    }
}