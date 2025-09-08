import java.util.*;
class Customer{
    private int cId;
    private String xName;
    private String number;

    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setxName(String xName) {
        this.xName = xName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getcId() {
        return cId;
    }

    public String getxName() {
        return xName;
    }

    public String getNumber() {
        return number;
    }
}
class Product{
    private int pId;
    private String pName;
    private int qty;
    private int rate;

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }

    public int getQty() {
        return qty;
    }

    public int getRate() {
        return rate;
    }

}
class Bill{
    private Product p[];
    private Customer c;
    public void setCust(Product p[],Customer c){
        this.p=p;
        this.c=c;
    }
    public void calBill()
    {
        System.out.println("customer id      "+c.getcId());
        System.out.println("customer name    "+c.getxName());
        System.out.println("customer number  "+c.getNumber());
        System.out.println("id\t\tname\t\tqty\t\trate\t\ttotal");
        int sum=0;
        for(int i=0;i<p.length;i++)
        {
            int total=p[i].getQty()*p[i].getRate();
            sum+=total;
            System.out.println(p[i].getpId()+"\t\t\t"+p[i].getpName()+"   \t"+p[i].getQty()+" \t\t"+p[i].getRate()+"\t\t\t"+total);
        }
        System.out.println("=======================================");
        System.out.println("\t\t\t\t\t\t"+sum);
    }
}
public class CustomerPro_24_4_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Customer c=new Customer();
        c.setcId(1);
        c.setxName("sanket");
        c.setNumber("7498273554");
        System.out.println("enter product array size");
        int size=sc.nextInt();
        Product p[]=new Product[size];
        for(int i=0;i<p.length;i++)
        {
            p[i]=new Product();
            System.out.println("enter product  Id");
            p[i].setpId(sc.nextInt());
            System.out.println("enter Product name");
            p[i].setpName(sc.next());
            System.out.println("enter quantity");
            p[i].setQty(sc.nextInt());
            System.out.println("enter rerte");
            p[i].setRate(sc.nextInt());
        }
        Bill b=new Bill();
        b.setCust(p,c);
        b.calBill();
    }
}
