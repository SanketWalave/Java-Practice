

import java.util.Scanner;

public class Pattern_i74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        int col;
        if (rows % 2 == 0)
            col = rows + 3;
        else col = rows + 4;

        int c=1;
        for (int i = 1; i <= rows; i++) {
            int count=1;
            int c2=1;
            for (int j = 1; j <= col; j++) {
                if (j <= i + col / 2 && j >= (col / 2 + 2) - i) {
                   if(c2<=c/2)
                       System.out.print(count++);
                   else
                       System.out.print(count--);

                   c2++;
                }
                else
                    System.out.print(" ");
            }

            System.out.println();
            c+=2;
        }
    }
}
