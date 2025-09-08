package Practice_10_5;

public class Mirrror_Q4P_10_5 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("sanket");
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            str.append(ch);
        }
        System.out.println(str);
    }
}
