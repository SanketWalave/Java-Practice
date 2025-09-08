package Practice_10_5;

public class FirstCapital_Q2P_10_5 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("sanket walave patil");
        for(int i=0;i<str.length()-1;i++){
            if(i==0 && str.charAt(i)>='a' && str.charAt(i)<='z'){
                str.setCharAt(0,(char) ((int)str.charAt(0)-32));
            }
            if(str.charAt(i+1)==' ' && (str.charAt(i)>='a' && str.charAt(i)<='z') ){

                str.setCharAt(i+2,(char) ((int)str.charAt(i+2)-32));
            }
        }
        System.out.println(str);
    }
}
