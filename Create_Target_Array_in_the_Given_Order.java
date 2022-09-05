import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] brr=new int[m];
        for(int i=0;i<m;i++)
        {
            brr[i]=sc.nextInt();
        }
        int[] res=new int[n];
        int i,j;
    for (i=0; i<n; i++)
    {
        res[i]=-1;
    }
    for (i=0; i<n; i++){
        if (res[brr[i]]==-1){
            res[brr[i]]=arr[i];
        }
        else{
            int temp=res[brr[i]];
            res[brr[i]]=arr[i];
            for (j=brr[i]+1; j<m; j++){
                int t2=res[j];
                res[j]=temp;
                temp=t2;
            }
        }
    }
    for (i=0; i<n; i++){
        System.out.printf("%d ",res[i]);
    }
    }
}