package ModelApp.org;

public class ProductList {
    private String productName;
    private int productquantity;
    public ProductList(String productName,int productquantity)
    {
        this.productName=productName;
        this.productquantity=productquantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductquantity(int productquantity) {
        this.productquantity = productquantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductquantity() {
        return productquantity;
    }
}
