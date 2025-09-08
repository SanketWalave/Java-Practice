public class ReplaceCharacterStr_22_4 {
    public static void main(String[] args) {
        System.out.println(replaceChar("hellow",'o','x'));
    }
    public static String replaceChar(String str,char oldC,char newC)
    {
        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++)
            if(ch[i]==oldC)ch[i]=newC;

        str="";
        str=new String(ch);

        return str;
    }
}
