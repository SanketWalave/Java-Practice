import java.util.Scanner;

public class CheckCar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character");
        char ch=sc.next().charAt(0);
        System.out.println(getType(ch));
    }
    public static String getType(char ch){
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            return "Alphabate";
        else if (ch<=9 && ch>=0)
            return "Number";
        else return "special Symbol";
    }
}
