import java.util.Arrays;

public class NonRepChar_23_4 {
    public static void main(String[] args) {
        char ch=getNonrep("swiss");
        if(ch!='`') System.out.println(ch);
        else System.out.println("not found");
    }
    public static char getNonrep(String str)
    {
        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j] && j!=i)
                {
                    flag=false;
                    break;
                }
            }
            if(flag){
                return ch[i];

            }
        }
        return '`';
    }
}
