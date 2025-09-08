import java.util.*;
/*Q3. WAP to create ArrayList and store Product details
 means we have 10 products with field id,name and price and
  use array of objects concept and store 10 products in ArrayList
  and find the occurrence of product whose price is same
 */
public class ProductApp {
    public static void main(String[] args) {
        ArrayList<Product> pl=new ArrayList<>();
        pl.add(new Product(1,"fan",1234));
        pl.add(new Product(2,"sdf",456));
        pl.add(new Product(3,"gfds",1234));
        pl.add(new Product(4,"gds",233));
        pl.add(new Product(5,"hh",334));
        pl.add(new Product(6,"tyu",1234));
        pl.add(new Product(7,"nh",233));
        pl.add(new Product(8,"rheh",23536));
        pl.add(new Product(9,"mrf",233));
        pl.add(new Product(10,"sb",1234));

        Map<Integer,Integer> map=new HashMap<>();
        for(Product p:pl){
            Integer price=p.getPrice();
            Object obj=map.get(price);
            Integer count=(Integer) obj;
            if(count==null){
                count=1;
            }else {
                count++;
            }
            map.put(price,count);
        }
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            System.out.println("Product with prise "+m.getKey()+" present "+m.getValue()+" times");
        }

    }
}
