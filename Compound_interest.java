import java.util.Scanner;
class spyder
{
    public static void main(String args[])
    {
        double p,r,t;
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        double s,a,i;
        s=1+(r/100);
        a=Math.pow(s,t);
        i=(p*a);
        System.out.format("%.2f",i);
        
    }
}