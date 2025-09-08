package product_company;
/*1. POJO Class:
Create a Product class with the following fields:
o productId (int)
o productName (String)
o unitPrice (double)
o quantity (int)
o batchId (int)
Include a parameterized constructor, getter & setter methods, and a method double totalPrice()
that returns the total price (unitPrice * quantity).*/
public class ProdApp {
   private int productId;
    private String productName;
    private double productPrice;
    private int quantity;
    private int batchId;

    public ProdApp(int productId, String productName, int batchId, double productPrice, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.batchId = batchId;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getBatchId() {
        return batchId;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
