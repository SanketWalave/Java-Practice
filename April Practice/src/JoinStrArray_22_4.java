public class JoinStrArray_22_4 {
    public static void main(String[] args) {
        String s[]={"sanket","walave"};
        System.out.println(getJoin(s));
    }
    public static String getJoin(String s[])
    {
        String str="";
        for(String w:s)str+=w;
        return str;
    }
}
