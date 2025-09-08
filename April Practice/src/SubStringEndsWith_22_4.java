public class SubStringEndsWith_22_4 {
    public static void main(String[] args) {

        System.out.println(isSubStringEndsWithStr("sanket","sanket"));
    }
    public static boolean isSubStringEndsWithStr(String str,String substr)
    {
        int end=str.length();
//        System.out.println(end);
        int mid=end-substr.length();
//        System.out.println(str.substring(mid,end));
        if(str.substring(mid,end).equals(substr))return true;
        return false;
    }
}
