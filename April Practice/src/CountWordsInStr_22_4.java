public class CountWordsInStr_22_4 {
    public static void main(String[] args) {
        System.out.println(getWordCount(" hellow  word "));
    }
    public static int getWordCount(String str)
    {
        str=" "+str;
        int count=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==32 && ch[i+1]!=32) count++;

        }
        return count;
    }
}
