package Q5;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bookm array size");
        Book b[]=new Book[sc.nextInt()];
        for(int i=0;i<b.length;i++){
//    public Book(String title,String author,double price,int stock){
          sc.nextLine();
            System.out.println("enter title");
            String title=sc.nextLine();
            System.out.println("enter author");
            String author=sc.nextLine();
            System.out.println("enter price");
            double price=sc.nextDouble();
            System.out.println("enter stock");
            int stock=sc.nextInt();
            b[i]=new Book(title,author,price,stock);
        }
        for(int i=0;i<b.length;i++){
            b[i].displayBooks();
            boolean flag=false;
            System.out.println("if you want to update stock enter 1");
            int num=sc.nextInt();
            if(num==1){
                int st=sc.nextInt();
                flag=true;
                b[i].UpdateStock(st);
            }
            System.out.println("if you want to apply discount enter 1");
             num=sc.nextInt();
            if(num==1){
                double dis=sc.nextInt();
                b[i].applyDiscount(dis);
                flag=true;
            }
            if(flag){
                System.out.println("info after changes");
                b[i].displayBooks();
                flag=false;
            }
        }
    }
}
