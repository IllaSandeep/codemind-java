import java.util.*;

class Sollll {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<Character> st = new ArrayDeque<>();
        int f = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
                f = 1;
            }
            else{
                if (st.size() > 0) {
                    if (st.peek() == '(' && ch == ')') {
                        st.pop();
                    } else if (st.peek() == '[' && ch == ']') {
                        st.pop();
                    } else if (st.peek() == '{' && ch == '}') {
                        st.pop();
                    } else {
                        System.out.println(i + 1);
                        f = 0;
                        break;
                    }
                } else {
                    System.out.println(i + 1);
                    f = 0;
                    break;
                }
            }
        }
        if (f == 1) {
            if (st.size() == 0) {
                System.out.println(0);
            } else {
                System.out.println(s.length()+ 1);
            }
        }
    }
}