import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double s=0;
        if(n==3)
        {
            System.out.println(10);
        }
        else if (n>3)
        {
            s=Math.pow(3,(n-3))*8*(n-2);
            s+=s/4;
            System.out.println((int)s);
        }
        else
        {
            System.out.println("0");
        }
    }
}