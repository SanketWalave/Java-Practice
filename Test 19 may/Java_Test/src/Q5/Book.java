package Q5;

public class Book {
//    Attributes : String title , String author , double price , int stockQuantity ;
    private String title;
    private String author;
    private double price;
    private int stock;
    public Book(){}
    public Book(String title,String author,double price,int stock){
        this.title=title;
        this.author=author;
        if(price<0)this.price=0;
        else this.price=price;
        if(stock<0)this.stock=0;
        else this.stock=stock;

    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
       this.price=0.0;
       this.stock=10;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        if(price<0)this.price=0;
        else this.price=price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setStock(int stock) {
        if(stock<0)this.stock=0;
        else this.stock=stock;
    }

//    @Override
    public void displayBooks() {
        System.out.println(
                "title   = " + title + '\n' +
                "author  = " + author +"\n" +
                "price   = " + price +"\n"+
                "stock   = " + stock
                );
    }
    public void UpdateStock(int quantity){
        if(quantity<0) System.out.println("Invalid");
    }
    public void applyDiscount(double dis){
        if(dis<=100){
            this.price=(price*dis/100);
        }else System.out.println("invalid");
    }
    public double getDisPrice(){
        return price;
    }
}
