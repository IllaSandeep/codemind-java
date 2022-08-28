import java.util.*; 
class Main
{
    public static boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
             switch (c) {
                case '(': bracket.push(c); break;
                case '{': bracket.push(c); break;
                case '[': bracket.push(c); break;
                case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
                case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
                case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
                default: ; 
            }
        }
        return bracket.isEmpty();
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
      String s = sc.next();
      boolean check = isValid(s);
          if(check){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
      }
  }
}