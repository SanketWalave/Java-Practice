public class ReverseString_22_4 {
    public static void main(String[] args) {
        System.out.println(getReverse("sanket"));
        System.out.println(getReverse("aniket"));
    }
    public static String getReverse(String str)
    {
        char ch[]=str.toCharArray();
        int end=ch.length-1;
        int mid=ch.length/2;
        for(int i=0;i<mid;i++)
        {
            char temp=ch[i];ch[i]=ch[end];ch[end]=temp;end--;
        }
        str="";
        str=new String(ch);
        return str;
    }
}
