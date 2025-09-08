package Practice_9_5;

public class DeleteDupliChar {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("programming");
        System.out.println(getRse(str));
    }
    public  static StringBuffer getRse(StringBuffer str){
//        for(int i=0;i<str.length()-1;i++){
//            char ch=str.charAt(i);
//            String de=str.substring(i+1,str.length()-1);
//           int index= de.indexOf(ch);
//           if(index==-1){
//               str.deleteCharAt(index);
//           }
//        }

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    str.deleteCharAt(j);
                }

            }
        }
        return str;
    }
}
