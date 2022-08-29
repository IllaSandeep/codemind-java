import java.util.*;
class Solution
{
    static final int chars= 256;
    static char secmost(String str)
    {
        int[] count = new int[chars];
        int i;
        for (i=0; i< str.length(); i++)
            (count[str.charAt(i)])++;
        int first = 0, second = 0;
        for (i = 0; i < chars; i++)
        {
            if (count[i] > count[first])
            {
                second = first;
                first = i;
            }
            else if (count[i] > count[second] && count[i] != count[first])
                second = i;
        }
      
        return (char)second;
    }
      
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);    
      String str = sc.next();
      char res = secmost(str);
      if (res != NULL)
         System.out.println(res);
      else
         System.out.println(-1);
    }
}