package Q7;

import java.util.Scanner;

/*Q7. Create a menu-driven program where the user can select an option to simulate
different exceptions and handle them using try-catch blocks.
1. ArithmeticException:
2. NullPointerException:
3. NumberFormatException:
4. ArrayIndexOutOfBoundsException:
5. ClassNotFoundException:*/
class demo{
    int id;
    public int getId(){
        return id;
    }
}
public class ExceptionHand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1. ArithmeticException: \n" +
                    "2. NullPointerException: \n" +
                    "3. NumberFormatException: \n" +
                    "4. ArrayIndexOutOfBoundsException: \n" +
                    "5. ClassNotFoundException\n"+"6. exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter teo numbers");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    try{
                        System.out.println(a/b);
                    }catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                    break;
                case 2:

                    demo d[]=new demo[2];
                    try{
                        for(int i=0;i<d.length;i++) System.out.println(d[i].getId());
                    }catch (NullPointerException n){
                        System.out.println(n);
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("enter string");
                    String str=sc.nextLine();
                    try{
                        Integer inte=Integer.parseInt(str);
                    }catch (NumberFormatException n){
                        System.out.println(n);
                    }
                    break;
                case 4:
                    int a4[]={1,2,3,4,5};
                    try {
                        for(int i=0;i<=a4.length;i++) System.out.println(a4[i]);
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(e);
                    }


                    break;
                case 5:
//                    try{
//
//                    }catch (ClassNotFoundException e){
//                        System.out.println(e);
//                    }
                    break;
                case 6:
                    System.exit(0);
                    break;




            }
        }while (true);
    }
}
