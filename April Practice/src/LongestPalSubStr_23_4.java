public class LongestPalSubStr_23_4 {
    public static void main(String[] args) {
        System.out.println(longPal("babad"));
    }
    public static String longPal(String str)
    {
        String longstr="";
        int len=0;
        for(int i=0;i<str.length();i++){
            for (int j=i;j<str.length();j++)
            {
                if(isPAl(str.substring(i,j))&& j-i>len)
                {
                    longstr=str.substring(i,j);
                    len=j-i;
                }
            }
        }
        return longstr;
    }
    public static boolean isPAl(String s)
    {
        int end=s.length()-1;
        int mid=s.length()/2;
        for(int i=0;i<mid;i++)
        {
            if(s.charAt(i)!=s.charAt(end))return false;
            end--;
        }
        return true;
    }
}
