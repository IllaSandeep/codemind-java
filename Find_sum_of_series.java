import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float s=0;
        for(float i=1;i<n+1;i++)
        {
            s=s+(1/i);
        }
        System.out.format("%.2f",s);
    }
}