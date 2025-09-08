import java.util.Arrays;

public class CheckAllUnique_23_$ {
    public static void main(String[] args) {
        System.out.println(isAllunique("abcdef"));
    }
    public static boolean isAllunique(String str)
    {
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])return false;
        }
        return true;
    }
}
