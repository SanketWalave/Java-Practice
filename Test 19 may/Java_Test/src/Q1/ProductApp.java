package Q1;

import java.util.*;

public class ProductApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product array size");
        int size=sc.nextInt();
        Product p[]=new Product[size];

        for(int i=0;i<p.length;i++){
            try {
                sc.nextLine();
                p[i] = new Product();
                System.out.println("enter product id");
                p[i].setProductId(sc.nextLine());
                System.out.println("enter product name");
                p[i].setPname(sc.nextLine());
                System.out.println("enter product Price");
                p[i].setPrice(sc.nextDouble());
                System.out.println("enter quantity");
                p[i].setQuan(sc.nextInt());
            }catch (Exception e){
                System.out.println("\n"+e+"\n");
            }
        }
        double bill=0;
        System.out.println("product id \t product name \t product price \t product qty");
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].toString());
            bill+=p[i].getQuan()*p[i].getPrice();
        }
        System.out.println("\n========================\n\t\t\t\t"+bill);
        System.out.println("bill after discount        "+(bill-(bill/10)));

    }
}
