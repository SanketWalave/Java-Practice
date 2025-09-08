package Practice_10_5;

public class CheckLongPrifPal_Q6_10_5 {
    public static void main(String[] args) {

        System.out.println(grtLongPrifWitPal("lev"));
    }
    public static String grtLongPrifWitPal(String str){
        String str2="";
        for(int i=0;i<str.length();i++){
            if(isPAl(str.substring(0,i)) && i>str2.length()){
                str2=str.substring(0,i);
            }
        }
        return str2;
    }
    public static  boolean isPAl(String str){
        int mid=str.length()/2;
        int end=str.length()-1;
        for(int i=0;i<mid;i++){
            if(str.charAt(i)!=str.charAt(end))return false;
            end--;
        }
        return true;
    }
}
