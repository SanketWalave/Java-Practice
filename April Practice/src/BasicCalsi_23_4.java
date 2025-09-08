public class BasicCalsi_23_4 {
    public static void main(String[] args) {
        System.out.println(getResult("10+20/3"));
    }

    public static int getResult(String str) {
        str += " "; // Append a space to simplify the loop condition
        char[] ch = str.toCharArray();
        int result = 0;
        int rev1 = 0;
        int rev2 = 0;
        int c = 0;
        char sign = '+'; // Initialize with '+' to handle the first number
        char sign2 = '+'; // Initialize with '+' to handle the first number
        boolean flag = true;
        boolean flag2 = false;
        for (int i = 0; i < ch.length; i++) {
           if(ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/')
           {
               sign2=ch[i];
           }

            if (ch[i] <= '9' && ch[i] >= '0') {
                int num = (int) (ch[i] - '0');
                rev1 = rev1 * 10 + num;
                System.out.println(rev1);
            } else if ((ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') && flag) {
                rev2 = rev1;
                rev1 = 0;
                sign = ch[i];
                flag = false;
                flag2=true;
                c=1;
            } else if (ch[i] == ' ' || (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/')) {

                char choice = ch[i];

                if (ch[i] == ' ' || c==1) {
                    choice = sign;c++;
                    flag2=false;
                    if(i==ch.length-1)
                    {
                        choice=sign2;
                    }
                }
                //else{
                //    choice=ch[i];
                //}

                switch (choice) {
                    case '+':
                        result = rev2 + rev1;
                        break;
                    case '-':
                        result = rev2 - rev1;
                        break;
                    case '*':
                        result = rev2 * rev1;
                        break;
                    case '/':
                        result = rev2 / rev1;
                        break;
                }
                System.out.println(result);
                rev2 = result;
                rev1 = 0;
                flag = true;
            }
        }
        return result;
    }
}
