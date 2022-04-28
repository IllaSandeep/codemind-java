import java.util.Scanner;
class solution {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        scan.close();
        double p=a*b;
        System.out.format("%.2f",p);
    }
}