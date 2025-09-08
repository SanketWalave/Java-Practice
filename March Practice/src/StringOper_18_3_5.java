import java.util.Scanner;
/*  Q4. Perform Method overloading using string operation

void stringOperation(String s): this function can accept string as parameter and sort it
void stringOperation(String first,String second): this function can compare two strings with each other and if strings
are equal then show message strings are equal otherwise not
void stringOperation(String s,char ch): this function can accept string as parameter and search specific character
in it if character found say character found otherwise show message character not found.
*/
class StringOp
{
//    private String str;
    public void StringOperation(String str)
    {
       char ch[]=str.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
           for(int j=i+1;j<ch.length;j++)
           {
               if(ch[i]>ch[j])
               {
                   char temp=ch[i];
                   ch[i]=ch[j];
                   ch[j]=temp;
               }
           }
       }
       str="";
       str=new String(ch);
       System.out.println("sorted String   "+str);
    }
    public void StringOperation(String str1,String str2)
    {
        if(str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
    public void StringOperation(String str,char ch)
    {
        char arr[]=str.toCharArray();
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("character found");
        else
            System.out.println("character not found");
    }
}
public class StringOper_18_3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringOp sop=new StringOp();
        System.out.println("enter string");
        sop.StringOperation(sc.next());
        System.out.println("enter two string");
        sop.StringOperation(sc.next(),sc.next());
        System.out.println("enter string and character");
        sop.StringOperation(sc.next(),sc.next().charAt(0));
    }
}
