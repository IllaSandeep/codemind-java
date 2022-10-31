import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] even=new int[1000];
        int[] odd=new int[1000];
        int specialchar=0,i,j=0,k=0,f=0,m;
        for(i=0;i<s.length();i++)
        {
            if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')))
            {
                specialchar++;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                if((s.charAt(i)-48)%2==0)
                {
                    even[j]=s.charAt(i)-48;
                    j++;
                }
                else
                {
                    odd[k]=s.charAt(i)-48;
                    k++;
                }
            }
        }
        if(k<j)
            m=j;
        else
            m=k;
        if(specialchar%2!=0)
        {
            int ev=0,ox=0;
            for(i=0;i<m;i++)
            {
                if(ox!=k)
                {
                    System.out.print(odd[ox]);
                    ox++;
                }
                if(ev!=j)
                {
                    System.out.print(even[ev]);
                    ev++;
                }
            }
        }
        else
        {
            int ev=0,ox=0;
            for(i=0;i<m;i++)
            {
                if(ev!=j)
                {
                    System.out.print(even[ev]);
                    ev++;
                }
                if(ox!=k)
                {
                    System.out.print(odd[ox]);
                    ox++;
                }
            }
        }
    }
}