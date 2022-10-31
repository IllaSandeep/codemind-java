import java.util.*;
class TestSample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[1000];
        int i,p=0,k,j,n1,c=0,n;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48&&s.charAt(i)<=57)
            {
                arr[p]=s.charAt(i)-'0';
                p++;
            }
        }
        for(i=0;i<p;i++)
        {
            if(arr[i]%2==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.printf("-1");
            System.exit(0);
        }
        n1=p;
        for(i=0;i<n1;i++)
        {
            for(j=i+1;j<p;j++)
            {
                if(arr[i]==arr[j])
                {
                    for(k=j;k<n1-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                    j--;
                    p--;
                }
            }
        }
        for(i=0;i<p;i++)
        {
            for(j=0;j<p-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    n=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=n;
                }
            }
        }
        int min=arr[0],l=0;
        for(i=0;i<p;i++)
        {
            if(arr[i]%2==0&&min>arr[i])
            {
                min=arr[i];
                l=i;
            }
        }
        for(i=0;i<p;i++)
        {
            if(i!=l)
            {
                System.out.printf("%d",arr[i]);
            }
        }
        System.out.printf("%d",arr[l]);
    }
}