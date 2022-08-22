import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ab=sc.nextInt();
        int bc=sc.nextInt();
        double hyp=Math.sqrt(ab*ab*1.0+bc*bc*1.0);
        hyp/=2;
        double h=ab*1.0/2;
        double angle=Math.acos(h/hyp);
        angle=angle*180/3.14;
        System.out.format("%.0f",angle);
    }
}