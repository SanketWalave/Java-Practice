package Practice_9_5;

public class ReverseWord {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("avaJ si lufrewop");

        StringBuffer str2 = new StringBuffer("");
        str.append(" ");
//        System.out.println(str);
        String w = "";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch !=32) {
                w += ch;
//                System.out.println(w);
//                System.out.println(str.charAt(i));
            } else {
//                System.out.println(w);
                    String str3=reverse(w)+" ";
                str2.append( str3);
                w="";
            }
//            System.out.println(w);
        }
        System.out.println(str2);
        System.out.println(getRev("avaJ si  lufrewop"));

    }
    public static String getRev(String str){
        String w="";
        String w2="";
        str+=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=32){
                w+=ch;
            }
            else{
                w2+=reverse(w)+" ";
                w="";
            }
        }
        return w2;
    }
    public static String reverse(String str2){
        char ch[]=str2.toCharArray();
        int end=ch.length-1;
        int mid=ch.length/2;
        for(int i=0;i<mid;i++){
            char temp=ch[i];
            ch[i]=ch[end];
            ch[end]=temp;
        }
        str2=new String(ch);
        return str2;
    }
}
