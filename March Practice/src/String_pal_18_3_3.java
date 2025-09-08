import java.util.*;
class StringPalim
{
    private String str;
    StringPalim(String str)
    {
        this.str=str;
    }
    String getRev()
    {
        char ch[]=str.toCharArray();
        int mid=ch.length/2;
        int end=ch.length-1;
        for(int i=0;i<mid;i++)
        {
            char temp=ch[i];
            ch[i]=ch[end];
            ch[end]=temp;
            end--;
        }
        str="";
        str=new String(ch);
        return str;
    }
    boolean getRPalindrome()
    {
        boolean flag=true;
        char ch[]=str.toCharArray();
        int mid=ch.length/2;
        int end=ch.length-1;
        for(int i=0;i<mid;i++)
        {
            if(ch[i]!=ch[end])
            {
                flag=false;
                break;
            }
            end--;
        }

        return flag;
    }
}

public class String_pal_18_3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");

        StringPalim sp=new StringPalim(sc.next());
        System.out.println("reverse String "+sp.getRev());

        System.out.println("enter String");

         sp=new StringPalim(sc.next());
        System.out.println("string palidrome "+sp.getRPalindrome());
    }
}
