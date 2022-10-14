import java.util.*;
import java.io.*;
class Solution 
{
  static int[] convertToBinary(int n,int len)
  {
    int[] a = new int[len];
    if (n == 0) 
    {
      return a;
    }
 
    int i=len-1;
    while (n!=0)
    {
      a[i--]=(n%2);
      n=n/2;
    }
    return a;
  }
  static int[][] getAllBinary(int n)
  {
    int[][] bin= new int[(int)Math.pow(2,n)][];
    int k = 0;
    for (int i = 0; i < Math.pow(2, n); i++)
    {
      int[] a = convertToBinary(i, n);
      bin[k++]= a;
    }
 
    return bin;
  }
  public static void main (String[] args)
  {
      Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[][] bin= getAllBinary(n);
    for(int i=0;i<bin.length;i++)
    {
      for (int j=0;j<bin[i].length;j++)
      {
        System.out.print(bin[i][j]);
      }
      System.out.println();
    }
 
  }
};