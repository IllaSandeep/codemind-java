import java.util.*;
class Solution
{
	public static void main(String args[])
	{
		String input;
		int c=1,d=1,i=1,found=0;
		int x[]=new int[10];
		Scanner sc=new Scanner(System.in);

		input=sc.next();
		if(input.length()>10)
		  System.out.println("-1");
		else
		{
		char ch[]=input.toCharArray();
        x[Integer.parseInt(ch[0]+"")]++;
		for(int j=1;j<ch.length;j++)
		{
          int k=Integer.parseInt(ch[j]+"");
		  int m=Integer.parseInt(ch[j-1]+"");

			if(k==m)
			{
			  c++;
			  d=0;
			  i=0;
			}
			else if(k==m+1)
			{
			  c=0;
			  i++;
			  d=0;
			}
			else if(k==m-1)
			{
				c=0;
				i=0;
				d++;
			}
			else
			{
			   c=1;
			   d=1;
			   i=1;
			}	

			if(c==3 || d==3 || i==3)
			{
			 found=1;
			 break;
			}
			x[k]++;
		}
		if(found==0)
		{
           for(int p=0;p<10;p++)
			{
			   if(x[p]>=5)
				{
				   found=1;
				   break;
				}
			}
		}
		if(found==1)
			System.out.println("FANCY NUMBER");
		else    
			System.out.println("NOT A FANCY NUMBER");
		
	}
	}
}