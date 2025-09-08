package Practice_10_5;
/* Q3. Write a program to Create LinkedList and
store 5 Product class objects in it and delete Product by using id.*/

import java.util.*;

class Q3Prod {
    private int id;
    private String name;
    private int price;

    public Q3Prod() {
    }

    public Q3Prod(int id, String name, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Q3Prod{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}

public class Q3_ProductLinjedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Q3Prod> ll=new LinkedList<>();
        ll.add(new Q3Prod(1,"a",100));
        ll.add(new Q3Prod(2,"b",200));
        ll.add(new Q3Prod(3,"c",300));
        ll.add(new Q3Prod(4,"d",400));
        ll.add(new Q3Prod(5,"e",500));
        for(Q3Prod p:ll){
            System.out.println(p.toString()+"\n========================\n");
        }
        System.out.println("enter id to delete");
        int id=sc.nextInt();
        Iterator<Q3Prod> i=ll.iterator();
        while (i.hasNext()){
            Q3Prod p=(Q3Prod) i.next();
            if(p.getId()==id)i.remove();
        }
        System.out.println("data aftr remove");
        for(Q3Prod p:ll){
            System.out.println(p.toString()+"\n========================\n");
        }

    }
}
