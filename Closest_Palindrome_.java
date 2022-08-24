import java.util.*;
class Solution
{
    public static int pal(int n)
    {
        int rev=0,temp=n;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int g=0,k=0;
        for(int i=n-1;i>1;i--)
        {
            if(pal(i)==1)
            {
                g=i;
                break;
            }
        }
        int temp=n+1;
        while(temp!=0)
        {
            if(pal(temp)==1)
            {
                k=temp;
                break;
            }
            temp+=1;
        }
        if((n-g)<(k-n))
        {
          System.out.println(g);  
        }
        else if ((n-g)==(k-n))
        {
            System.out.printf("%d %d",g,k);
        }
        else
        {
            System.out.println(k);
        }
    }
}