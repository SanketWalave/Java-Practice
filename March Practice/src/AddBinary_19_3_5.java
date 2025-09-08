import java.util.Scanner;

public class AddBinary_19_3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        String b1 =getBinary(num1);
        String b2=getBinary(num2);


    }

    public static String getBinary(int n){
        String s = "";
        while(n!=0){
            int rem = n%2;
            s = rem + s;
            n=n/2;
        }
        return s;
    }

}
