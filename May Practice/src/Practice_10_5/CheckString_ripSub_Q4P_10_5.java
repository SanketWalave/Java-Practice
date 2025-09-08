package Practice_10_5;

public class CheckString_ripSub_Q4P_10_5 {
    public static void main(String[] args) {
        boolean ans=istrue("aaaaa");
        System.out.println(ans);
    }
    public static boolean istrue(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for(int i=1;i<=str.length()/2;i++){
            String  sub=str.substring(0,i);
//            System.out.println(sub);
            int len=sub.length();
//            System.out.println(len);
            boolean flag=true;
           if(str.length()%sub.length()!=0)continue;

            for(int j=0;j<str.length();j+=len){
//                System.out.println(str.substring(j,j+len));
                if(!(str.substring(j,j+len).equals(sub))){
                    flag=false;break;
                }

            }
            if(flag)return true;
        }

        return false;
    }
}
