import java.util.*;
class Solution
{
	public static void main (String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    double x1 = sc.nextInt();
		    double x2 = sc.nextInt();
		    double y1 = sc.nextInt();
		    double y2 = sc.nextInt();
		    
		    double a = y1/x1;
		    double b = y2/x2;
		     
		     if(a<b){
		         System.out.println("-1");
		     }
		     else{
		         if(a>b)
		         System.out.println("1");
		         else 
		         System.out.println("0");
		         
		     }
		     
		}
	}
}