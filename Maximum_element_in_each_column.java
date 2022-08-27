import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
              for (int i = 0; i < c; i++) {
 
            int maxm = arr[0][i];
            for (int j = 1; j < arr[i].length; j++)
                if (arr[j][i] > maxm)
                    maxm = arr[j][i];
 
            System.out.println(maxm);
        }
    }
}