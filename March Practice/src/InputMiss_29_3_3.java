import java.util.*;
public class InputMiss_29_3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            int a=sc.nextInt();
//            sc.next();
            String b=sc.next();
            System.out.println(b);
            System.out.println(b);
        }
        catch(InputMismatchException ex)
        {
            System.out.println(ex);
        }
        System.out.println("logic");
    }
}
