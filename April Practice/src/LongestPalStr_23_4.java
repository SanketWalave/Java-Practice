public class LongestPalStr_23_4 {
    public static void main(String[] args) {
        System.out.println(getLongstPalSubStr("babad"));
    }

    public static String getLongstPalSubStr(String str) {
        String longstr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + longstr.length(); j < str.length(); j++) {
                if (isPal(str.substring(i, j)) && j - i > longstr.length()) {
                    longstr = str.substring(i, j);
                }
            }
        }
        return longstr;
    }

    public static boolean isPal(String s) {
        int end = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(end)) return false;
            end--;
        }
        return true;
    }
}
