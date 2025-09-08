import java.util.*;
public class SplitStrInWord_22_4 {
    public static void main(String[] args) {
        String str="sanket walave";
        String str1=str.trim();
        String s[]=str1.split(" ");
        for(String st:s)
            System.out.println(st);
    }
}
