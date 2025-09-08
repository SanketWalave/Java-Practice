package Q1;

public class Product {
     private String productId;
     private String pname;
     private double price;
     private int quan;
     public Product(){}
    public Product(String productId,String pname,double price,int quan){
         this.productId=productId;
         this.pname=pname;
         this.price=price;
         this.quan=quan;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public String getProductId() {
        return productId;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public int getQuan() {
        return quan;
    }

    @Override
    public String toString() {
        return  productId + "\t\t'" +
                  pname + "\t\t" +
                 price +"\t\t"+
                 + quan ;
    }
}
