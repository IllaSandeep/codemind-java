import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.printf("%d",j);
            }
            System.out.println();
        }
    }
}