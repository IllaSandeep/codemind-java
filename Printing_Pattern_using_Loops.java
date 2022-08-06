import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,m,n,x;
        n=sc.nextInt();
        k=n;
        m = n+(n-1);
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i<=n-1)
                {        
                    if(i==0)
                    {
                    System.out.format("%d ",k);
                        }
                        if(i>=1)
                        {
                            if(j<i)
                            {
                                System.out.format("%d ",k-j);
                            }
                            else if(j>=i && j<m-i)
                            {
                                System.out.format("%d ",k-i);
                            }
                            else 
                            {
                                System.out.format("%d ",(j-k+1)+1);
                            }
                        }
                    }
                    else if(i==n-1)
                    {
                        if(j<n)
                        {
                            System.out.format("%d ",k-j);
                        }
                        else
                        {
                            System.out.format("%d ",(j-k+1)+1);
                        }
                    }
                    else if(i>=n)
                    {
                        x = m-i-1;
                        if(i==m)
                        {
                        System.out.format("%d ",k);
                        }
                        if(j<x)
                        {
                            System.out.format("%d ",k-j);
                        }
                        else if(j>=x && j<m-x)
                        {
                            System.out.format("%d ",k-x);
                        }
                        else 
                        {
                            System.out.format("%d ",(j-k+1)+1);
                        }    
                    }
                }
                System.out.format("
");
     }
    }
}
