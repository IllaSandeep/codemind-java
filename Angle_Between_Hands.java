import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String input[]=line.split(":");
        int h=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        double a=Math.abs((h*30)-(11*m)/2.0);
        if(a<360-a)
           if(a>(int)a)
            System.out.printf("%.1f",a);
           else
            System.out.printf("%.1f",a);
        else
           if(360-a>(int)(360-a))
                 System.out.printf("%.1f",360-a);
           else
                 System.out.printf("%.1f",(360-a));
        
        sc.close();
    
    }
}