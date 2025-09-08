package Pattern.inte;

import java.util.Scanner;

public class Pattern_74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int rows=sc.nextInt();
        int col=rows+2;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(j>=col/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
