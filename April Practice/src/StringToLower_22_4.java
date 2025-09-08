public class StringToLower_22_4 {
    public static void main(String[] args) {
        System.out.println(getLowerCase("SANKET"));
    }
    public static String getLowerCase(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]<='Z' && ch[i]>='A'){
                ch[i]=(char)((int)ch[i]+32);
            }
        }
        str=new String(ch);
        return str;
    }
}
