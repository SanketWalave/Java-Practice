import  java.util.*;
public class Check_Ana_23_4 {
    public static void main(String[] args) {
        System.out.println(isAnagaram("listen","silent"));
    }
    public static boolean isAnagaram(String str1,String str2)
    {
        if(str1.length()!=str2.length())return false;
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i])return false;
        }
        return true;
    }
}
