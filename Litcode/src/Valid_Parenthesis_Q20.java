import java.util.*;

public class Valid_Parenthesis_Q20 {
    public static void main(String[] args) {
        System.out.println(isValid("([]())"));
    }
    public static  boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(')st.push(')');
            else if(ch[i]=='[')st.push(']');
            else if(ch[i]=='{')st.push('}');
            else if( st.isEmpty()|| st.pop()!=ch[i])return false;
//            System.out.println(st);

        }
//        System.out.println("23456789");
//        System.out.println(st.isEmpty());
       return st.isEmpty();
    }
}
