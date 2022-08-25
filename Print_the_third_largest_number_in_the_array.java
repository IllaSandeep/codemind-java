import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> l=new HashSet<Integer>();
        List<Integer>k=new ArrayList<Integer>();
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j] && i!=j)
                {
                    a[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=-1)
            {
               k.add(a[i]);
            }
        }
         if(k.size()>=3)
         {
         System.out.println(k.get(k.size()-3));
         }
         else
         {
             System.out.println("It is not possible");
         }
    }
}