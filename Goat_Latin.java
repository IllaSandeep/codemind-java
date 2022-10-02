import java.util.*;
class Solution {
  public static String toGoatLatin(String sentence) {
    String[] words = sentence.split("\s+");
    StringBuilder result = new StringBuilder();
    StringBuilder aWord = new StringBuilder();
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
    for (String word : words) {
      aWord.append('a');
      char firstChar = word.charAt(0);
      if (vowels.contains(Character.toLowerCase(firstChar))) {
        result.append(word).append("ma");
      } else {
        result.append(word.substring(1)).append(firstChar).append("ma");
      }
      result.append(aWord.toString()).append(" ");
    }
    return result.toString().trim();
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      System.out.println(toGoatLatin(s));
  }
}