import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int i=0,sum=0;
        while(i<n-1)
        {
            sum+=Math.abs((int)s.charAt(i+1)-(int)s.charAt(i));
            i++;
        }
        sum=n-sum-1;
        if(sum%3==0)
        {
            System.out.println("Sudhir");
        }
        else
        {
            System.out.println("Ashok");
        }
    }
}