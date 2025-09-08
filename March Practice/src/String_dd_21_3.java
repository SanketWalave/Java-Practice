import java.util.Scanner;

public class String_dd_21_3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        str+='.';
        char ch[]=str.toCharArray();
        //a11b3

            for (int i = 0; i < ch.length-1; i++) {
                String w = "";
                if (ch[i] >= 48 && ch[i] <= 57) {
                    w += ch[i];

                    if (ch[i + 1] >= 48 && ch[i + 1] <= 57) {
                        w += ch[i + 1];

                    }

                    int num = Integer.parseInt(w);
                    if (ch[i - 1] >= 48 && ch[i - 1] <= 57) {

                    } else {
                        for (int j = 1; j <= num; j++) {
                            System.out.print(ch[i - 1]);
                        }
                    }
                    if (ch[i + 1] >= 48 && ch[i + 1] <= 57) {
                        i++;

                    }
                }
            }





    }
}
