public class CountVowel_22_4 {
    public static void main(String[] args) {
        System.out.println(getVowelCount("hellow"));
    }
    public static int getVowelCount(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='e'||ch=='O'||ch=='I'||ch=='U')
                count++;
        }
        return count;
    }

}
