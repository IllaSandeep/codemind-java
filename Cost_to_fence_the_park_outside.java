import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        int cost;
        int area=((l+(2*w))*(b+(2*w)))-(l*b);
        cost=area*c;
        System.out.println(cost);
    }
}