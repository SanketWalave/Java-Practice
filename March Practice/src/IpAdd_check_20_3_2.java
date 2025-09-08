import java.util.Scanner;
interface ValidateIpDomain
{
    void setString(String str);
    boolean isValide();
}
class IpValidator implements ValidateIpDomain
{
    protected String str;
    public void setString(String str)
    {
        this.str=str;
    }
    public boolean isValide()
    {
        str+=".";
        char ch[]=str.toCharArray();
        System.out.println(ch.length);
        String w="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='.')
            {
                w+=ch[i];
            }
            else
            {
                int num=Integer.parseInt(w);
                if(num>255)
                    return false;

                w="";
            }
        }
        return true;

    }
}
class DomainValidator implements ValidateIpDomain
{
    protected String str;
    public void setString(String str)
    {
        this.str=str;
    }
    public boolean isValide()
    {

        char ch[] = str.toCharArray();
        int end=ch.length-1;
        if(ch[0]=='-' || ch[end]=='-')
        {
            return false;
        }


//        {
//            return false;
//        }
        for(int i=0;i<ch.length;i++)
        {

            if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')||(ch[i]>='0' && ch[i]<='9')||(ch[i]=='.'))
            {
                continue ;
            }
            else
            {
                return false;
            }
        }
//        end=ch.length-4;
//        if(ch[end]!='.' || ch[end+1]!='c'|| ch[end+3]!='o' || ch[end+3]!='m')
//        {
//            return false;
//        }
        end = ch.length - 4;
        if (end >= 0 && ch[end] == '.' && ch[end + 1] == 'c' && ch[end + 2] == 'o' && ch[end + 3] == 'm') {
            return true;
        } else if (ch.length >= 3 && str.substring(ch.length - 3).equals(".org")) {
            return true;
        } else if (ch.length >= 3 && str.substring(ch.length - 3).equals(".net")) {
            return true;
        }
        return true;
    }
}
class DomainIpValidator
{
    public boolean hasCorrect(ValidateIpDomain vip)
    {
        if(vip.isValide())
            System.out.println("valid");
        else
            System.out.println("Invalid");
        return true;
    }
}
public class IpAdd_check_20_3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        DomainIpValidator div=new DomainIpValidator();
        IpValidator ipv=new IpValidator();
        System.out.println("enter string");
        ipv.setString(sc.next());
        div.hasCorrect(ipv);
        DomainValidator dv=new DomainValidator();
        System.out.println("enter string");
        dv.setString(sc.next());
        div.hasCorrect(dv);
    }
}
