class Solutionsi {
    public int myAtoi(String s) {
        String str = s.trim();

        if (str.length() == 0)
            return 0;
        int i = 0;
        int sign = 1;
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {

            i++;
        }
       long res = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch > '9' || ch < '0') {
                break;
            }

                res = res * 10 +  (ch - 48);
                if (sign * res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign * res < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }


            i++;
        }

        return  (int) (sign * res);
    }
}

public class StringTo_integer_6_4 {
    public static void main(String[] args) {
        Solutionsi s = new Solutionsi();
        System.out.println(s.myAtoi("-91283472332"));

    }
}
