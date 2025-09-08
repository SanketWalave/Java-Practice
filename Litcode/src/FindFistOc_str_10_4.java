class Solution_28 {
    public int strStr(String haystack, String needle) {
        int j = needle.length();
        boolean flag = true;
        for (int i = 0; j <= haystack.length(); i++) {
                if (haystack.substring(i, j).equals(needle)) {
                    return i;
                }
                j++;
        }
            return -1;
    }
}

public class FindFistOc_str_10_4 {
    public static void main(String[] args) {
        Solution_28 s = new Solution_28();
        System.out.println(s.strStr("sadbutsad", "adb"));

    }
}
