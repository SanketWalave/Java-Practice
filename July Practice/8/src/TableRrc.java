import java.util.Scanner;

public class TableRrc {
    static int i=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        Table(num);
    }
    public static void Table(int num){
         System.out.println(i*num);
        i++;
        if(i<=10){
            if(i*10>Integer.MAX_VALUE){
                System.out.println("Max");
                return;
            }

        }else {
            return;
        }
        Table(num);
    }
}
