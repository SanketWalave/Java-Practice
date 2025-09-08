import java.util.Arrays;
import java.util.*;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        char []ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
//            char ch=str.charAt(i);
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
//                str.
            }
        }
//        System.out.println(Arrays.toString(ch));
        str=new String(ch);
        System.out.println(str);
    }
}
