public class FreqInStr_22_4 {
    public static void main(String[] args) {
        System.out.println(getFreq("hellow",'l'));
    }
    public static int getFreq(String str,char ch)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                count++;
        }
        return count;
    }
}
