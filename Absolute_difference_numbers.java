import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a=(int)Math.log10(n)+1;
        int b=n%(int)Math.pow(10,x);
        int c=n/(int)Math.pow(10,a-x);
        System.out.println((int)Math.abs(b-c));
    }
}