import java.util.HashSet;

public class AllSubstr_23_4 {
    public static void main(String[] args) {
        System.out.println(getSubstr("abc"));
    }
    public static HashSet getSubstr(String str)
    {
        HashSet hs=new HashSet();
        for(int i=0;i<=str.length();i++)
        {
            for(int j=i;j<=str.length();j++)
            {
//                System.out.println(str.substring(i,j));
                hs.add(str.substring(i,j));
            }
        }
        return hs;
    }
}
