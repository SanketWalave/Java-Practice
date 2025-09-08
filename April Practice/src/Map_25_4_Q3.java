import java.util.*;

class Book_25_4{
    private int id;
    private String name;
    private int price;
    private String auther;
    public Book_25_4(){

    }
    public Book_25_4(int id,String name,int price,String auther){
        this.id=id;
        this.name=name;
        this.price=price;
        this.auther=auther;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuther(String auther) {
        this.auther = auther;
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

    public String getAuther() {
        return auther;
    }
    public String toString(){
        return "Book_25_4{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + auther + '\'' +
                "}";
    }
}
public class Map_25_4_Q3 {
    public static void main(String[] args) {
        ArrayList<Book_25_4> al1=new ArrayList<>();

        Book_25_4 p1=new Book_25_4(1,"science",100,"walave");
        Book_25_4 p2=new Book_25_4(2,"science",100,"walave");
        Book_25_4 p3=new Book_25_4(3,"science",100,"walave");
        al1.add(p1);
        al1.add(p2);
        al1.add(p3);

        ArrayList<Book_25_4> al2=new ArrayList<>();
        Book_25_4 s1=new Book_25_4(1,"bhagavat geeta",1000,"shreeKrishna");
        Book_25_4 s2=new Book_25_4(2,"bhagavat geeta",1000,"shreeKrishna");
        Book_25_4 s3=new Book_25_4(3,"bhagavat geeta",1000,"shreeKrishna");
        al2.add(s1);
        al2.add(s2);
        al2.add(s3);

        LinkedHashMap<String,ArrayList<Book_25_4>> hm=new LinkedHashMap();
        hm.put("programing",al1);
        hm.put("spiritual",al2);

//        Set<Map.Entry> es=hm.entrySet();
        for (Map.Entry<String,ArrayList<Book_25_4>> m : hm.entrySet()) {

            String gener=(String) m.getKey();
            System.out.println("\n==========="+gener+"=============\n");
            ArrayList bookList=(ArrayList) m.getValue();

            Iterator i=bookList.iterator();
            while (i.hasNext())
            {
                Object obj=i.next();
                Book_25_4 bi=(Book_25_4) obj;
                System.out.println(bi.getId());
                System.out.println(bi.getName());
                System.out.println(bi.getPrice());
                System.out.println(bi.getAuther());

                System.out.println("\n========================\n");
            }

        }


    }
}
