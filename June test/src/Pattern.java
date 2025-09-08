import java.util.Scanner;

/*
0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0
*/
public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int row=sc.nextInt();
        for (int i = 1; i <=row; i++) {
            int c=i-1;
            for (int j = 1; j <=row ; j++) {
                    if(c==0 || j>i){
                        System.out.print(c++);
                    }else  {
                        System.out.print(c--);
                    }
            }
            System.out.println();

        }
    }
}
