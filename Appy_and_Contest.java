import java.util.*;
class Solution
{
    public static int LCM(int m,int n)
    {
        int max=m>n?m:n;
        int lcm=max;
        while(true)
        {
            if(lcm%m==0 && lcm%n==0)
                break;
            
            lcm=lcm+max;
        }
        return lcm;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,A,B,K;
        long N;
        t=sc.nextInt();
        while(t-- > 0)
        {
            N=sc.nextLong();
            A=sc.nextInt();
            B=sc.nextInt();
            K=sc.nextInt();
            int count=(int)N/A + (int)N/B - (int)N/LCM(A,B);
            if(count>=K)
            System.out.println("Win");
            else
            System.out.println("Lose");
        }
    }
}