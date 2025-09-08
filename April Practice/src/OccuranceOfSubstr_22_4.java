public class OccuranceOfSubstr_22_4 {
    public static void main(String[] args) {
        System.out.println(getOccSubStr("sanket sanketsansansan walave sanket","san"));
    }
    public static int getOccSubStr(String str,String substr)
    {
        int count=0;
        int w=substr.length()-1;
        int right=substr.length();
        for(int i=0;i<str.length()-w;i++)
        {
            System.out.println(str.substring(i,right));
            if(str.substring(i,right).equals(substr))
            {
                count++;
            }
            right++;
        }
        return count;
    }
}
