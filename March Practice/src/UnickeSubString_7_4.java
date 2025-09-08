import java.util.*;

public class UnickeSubString_7_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abcabcde";
        HashSet<String> hs=new HashSet<String>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                hs.add(s.substring(i,j));
            }
        }
        for(String str:hs)
        {
            System.out.print(str+"\t");
        }
    }
}
