import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n==1)
            {
                if(x%2==0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
                
            }
            else if(x%2==0)
            {
                System.out.println("Impossible");
            }
            else if(n%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
        }
    }
}