import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            char[] chars = new char[s.length()];
            for(int i=0;i<s.length();i++)
               chars[i]=s.charAt(i);
            while(b>0)
            {
                int k=b-1;
                int j=0;
                while(j<k)
                {
                    char temp=chars[j];
                    char te=chars[k];
                    chars[j]=te;
                    chars[k]=temp;
                    j++;
                    k--;
                }
                b--;
            }
            s=String.valueOf(chars);
            System.out.print(s);
            System.out.printf("
");
        }
                    
    }
            
}
    