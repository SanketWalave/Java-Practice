package collection_march;

import java.util.*;
class Product
{
    private int pid;
    private String pname;

    public Product(int pid,String pname)
    {
        this.pid=pid;
        this.pname=pname;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public int getPid() {
        return pid;
    }
    public String getPname() {
        return pname;
    }
}
public class Product_2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList al=new ArrayList();

        do {
            System.out.println("1:Add product");
            System.out.println("2:view product");
            System.out.println("3:leave");
            System.out.println("enter your choice");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("enter id and name of product");
                    Product p=new Product(sc.nextInt(),sc.next());
                    al.add(p);
                    break;
                case 2:
                    Iterator i=al.iterator();
                    while(i.hasNext())
                    {
                        Object obj=i.next();
                        Product pr=(Product) obj;
                        System.out.println("=================");
                        System.out.println("pid  "+pr.getPid());
                        System.out.println("p name  "+pr.getPname());
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }while (true);
    }
}
