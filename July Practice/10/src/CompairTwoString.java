public class CompairTwoString {
    public static void main(String[] args) {
        String str1="sanket";
        String str2="sankt";
        System.out.println(areEqual(str1,str2));
    }
    public static boolean areEqual(String str1,String str2){
        if(str1.length()!=str2.length())return false;
        for(int i=0;i< str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i))return false;
        }
        return true;
    }
}
