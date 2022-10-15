import java.util.*;

class Arun
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) 
        {
            a[i]=sc.nextInt();
           
        }
        for(int i=0;i<n;i++)
        {
            int min=a[i];
            if(i==0)
            {
                System.out.print(-1+" ");
            }
            else
            {
                for(int j=i;j>=0;j--)
                {
                    if(a[j]<min){
                        min=a[j];
                        break;
                    }
                }
                if(min==a[i]){
                    System.out.print(-1+" ");
                }
                else{
                   System.out.print(min+" "); 
                }
            }
            
        }
    }
}