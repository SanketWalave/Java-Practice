public class NonRepCharStr_22_4 {
    public static void main(String[] args) {
        String str = "swiss";
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            boolean flag = true;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j] && j != i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(ch[i]);
                break;
            }
        }
    }
}
