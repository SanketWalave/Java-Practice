package Q6;

public class Product implements Txable{

    int pid;
    String name;
    double price;
    public Product(){}
    public Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price ;

    }

    @Override
    public double calculateTax() {
       return (price*5)/100;
    }
}
