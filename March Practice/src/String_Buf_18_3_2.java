class StringData
{
    protected  StringBuffer str;
    StringData(StringBuffer str)
    {
        this.str=str;
    }
    int getLength()
    {
        return str.length();
    }
//    StringBuffer getConcact()
//    {
////        str= toString().concat()
//    }
    StringBuffer getRev()
    {
        str=str.reverse();
        return str;
    }
}
public class String_Buf_18_3_2 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("abcd");
    StringData sd=new StringData(str);
        System.out.println(sd.getLength());
        System.out.println(sd.getRev());


    }
}
