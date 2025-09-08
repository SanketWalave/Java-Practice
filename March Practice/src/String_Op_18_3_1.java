import java.util.*;
interface StringTemplate
{
    void setString(String str);
    int getResult();
}
class ExtractDigit implements StringTemplate
{
    protected String  str;
    public void setString(String str)
    {
        this.str=str;
    }
    public int getResult()
    {
        int sum=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=48 && ch[i]<=57 )
            {
                sum+=((int)ch[i]-48);
            }
        }
        return sum;
    }
}
class CountVowel implements StringTemplate
{
    protected String  str;
    public void setString(String str)
    {
        this.str=str;
    }
    public int getResult()
    {
        int count=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u' || ch[i]=='i'|| ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
            {
                count++;
            }
        }
        return count;
    }
}
class StringHelper
{
    void PerformOperation(StringTemplate temp)
    {
        System.out.println(temp.getResult());
    }
}
public class String_Op_18_3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringHelper sh=new StringHelper();
        ExtractDigit ed=new ExtractDigit();
        System.out.println("enter string");
         ed.setString(sc.next());
         sh.PerformOperation(ed);

         CountVowel cv=new CountVowel();
        System.out.println("enter string");
         cv.setString(sc.next());
        sh.PerformOperation(cv);
    }
}
