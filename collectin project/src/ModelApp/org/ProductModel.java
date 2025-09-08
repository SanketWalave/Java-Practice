package ModelApp.org;

public class ProductModel {
    private int id;
    private String name;
    private String company;
    private int price;
    private int stock;
    private int qty;
    public ProductModel(int id, String name, String company, int price, int stock,int qty) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.stock = stock;
        this.qty=qty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public int getStock() {
        return stock;
    }

    public int getQty() {
        return qty;
    }
}
