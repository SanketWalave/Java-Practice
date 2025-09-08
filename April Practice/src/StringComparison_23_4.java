import java.util.Arrays;

public class StringComparison_23_4 {
    public static void main(String[] args) {
        System.out.println(getComp("aabccccccffaaa"));
    }
    public static String getComp(String str)
    {
        str+=" ";
        char ch[]=str.toCharArray();
        String str2="";
       // Arrays.sort(ch);
        int count=1;
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                count++;
            }
            else{
                int num=(char)count;
//                System.out.println(count);
//                System.out.println(ch[i+1]);
                str2=str2+ch[i]+num;
                count=1;
            }
        }
        return str2;
    }
}
