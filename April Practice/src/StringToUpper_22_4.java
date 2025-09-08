public class StringToUpper_22_4 {
    public static void main(String[] args) {
        System.out.println(getUpper("sanket"));
    }
    public static String getUpper(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                ch[i]=(char) ((int)ch[i]-32);
            }
        }
        str="";
        str=new String(ch);
        return str;
    }
}
