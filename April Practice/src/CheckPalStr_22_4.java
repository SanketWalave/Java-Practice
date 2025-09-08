public class CheckPalStr_22_4 {
    public static void main(String[] args) {
        System.out.println(isPal("madam"));
    }
    public static boolean isPal(String str)
    {
        int end=str.length()-1;
        int mid=str.length()/2;
        for(int i=0;i<mid;i++)
        {
            if(str.charAt(i)!=str.charAt(end))
                return false;
            end--;
        }
        return true;
    }
}
