import java.util.*;
class Solution 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Set<Integer> set=new HashSet<>();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                set.add(a[i]);
                c++;
            }
        }
        int res=1;
        while(set.contains(res) && c>=0)
        {
            res++;
            c--;
        }
        System.out.println(res);
            
    }
}