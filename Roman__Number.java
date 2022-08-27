 import java.util.*;
 class Solution {

    public static void integerToRoman(int n)
    {

        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder l = new StringBuilder();

        for(int i=0;i<val.length;i++) {
            while(n >= val[i]) {
                n -= val[i];
                l.append(rom[i]);
            }
        }
        System.out.println(l.toString());
        
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       integerToRoman(n);
    }
}