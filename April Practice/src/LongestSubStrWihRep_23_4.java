import java.util.*;
public class LongestSubStrWihRep_23_4 {
    public static void main(String[] args) {
        System.out.println(getLongLength("abcabcbb"));
    }
    public static int getLongLength(String str)
    {
        int len=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if(isUnique(str.substring(i,j))&& j-i>len)
                {
                    len=j-i;
                }
            }
        }
        return len;

    }
    public static boolean isUnique(String s)
    {
            char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]) return false;
        }
        return true;
    }
}
