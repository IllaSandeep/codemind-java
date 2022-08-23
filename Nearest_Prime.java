import java.util.*;
class Solution
{
    public static int prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        for(int i=2;i<Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int p=0;p<t;p++)
        {
            int n=sc.nextInt();
            int temp=n;
            int k=0,g=0;
            for(int i=n;i>1;i--)
            {
                if(prime(i)==1)
                {
                    k=i;
                    break;
                }
            }
            while(temp!=0)
            {
                if(prime(temp)==1)
                {
                    g=temp;
                    break;      
                }
                temp+=1;
            }
            if((n-k)<=(g-n))
            {
                System.out.println(k);
            }
            else if((n-k)>=(g-n))
            {
                System.out.println(g);
            }
            
        }
        
    }
}