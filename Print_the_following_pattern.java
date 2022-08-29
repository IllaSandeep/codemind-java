import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++)
        {
            for(int j=i;j<n+1;j++)
            {
             System.out.printf("%d ",j);  
            }
            System.out.println();
        }
    }
}