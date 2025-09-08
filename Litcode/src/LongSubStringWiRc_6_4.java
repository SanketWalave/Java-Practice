import java.util.HashSet;
import java.util.List;

class Solutionlwr{
    public int lengthOfLongestSubstring(String s){
        int mlength=0;
        HashSet<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                if(set.contains(s.charAt(i)))
                {

                }
            }
        }
        return mlength;
    }
    public boolean istrue(String s)
    {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for (int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j] && i!=j)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
public class LongSubStringWiRc_6_4 {
    public static void main(String[] args) {
        Solutionlwr s=new Solutionlwr();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));

    }
}