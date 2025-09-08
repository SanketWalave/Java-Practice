import java.util.*;
public class ArithmaticEx_29_3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int c=division(a,b);
        System.out.println(c);
    }
    public static int division(int a,int b)
    {
        int c=0;
        try{
            c=a/b;
            return c;
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
        }
        return c ;
    }
}
