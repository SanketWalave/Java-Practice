package Practice_9_5;

public class AddStringAtMid {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("HelloWorld");
        StringBuffer str2=new StringBuffer("java");
        System.out.println(getResult(str,str2));
        System.out.println(getResult2("helloworld","java"));
        System.out.println(getResult3("helloworld","java"));
    }
    public static StringBuffer getResult(StringBuffer str,StringBuffer str2){
        str.insert(str.length()/2,str2);
        return str;
    }
    public static String getResult2(String str,String str2){
        String str3="";
        int mid=str.length()/2;
        str3=str.substring(0,mid)+str2+str.substring(mid,str.length());
        return str3;
    }
    public static String getResult3(String str,String str2){
        String str3="";
        int mid=str.length()/2;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

             if(i==mid) str3+=str2;

                 str3+=ch;

        }
        return str3;
    }
}
