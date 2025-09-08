public class RemoveVowel_23_4 {
    public static void main(String[] args) {
        System.out.println(getResult("sanket"));
    }
    public static String getResult(String str)
    {
        String str2="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') continue;
            else str2+=ch;
        }
        return str2;
    }
}
