package HashMap;
import java.util.*;
import java.util.*;
public class HashMAp_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product(1, "fan");
        Product p2 = new Product(1, "tv");
        Product p3 = new Product(1, "latop");
        ArrayList al1 = new ArrayList();
        al1.add(p1);
        al1.add(p2);
        al1.add(p3);

        Product p4 = new Product(2, "fan");
        Product p5 = new Product(3, "tv");
        Product p6 = new Product(3, "latop");
        ArrayList al2 = new ArrayList();
        al2.add(p4);
        al2.add(p5);
        al2.add(p6);

        LinkedHashMap lhp1 = new LinkedHashMap();
        lhp1.put("m001", al1);
        lhp1.put("m002", al2);

        LinkedHashMap lhp2 = new LinkedHashMap();
        lhp2.put("m011", al1);
        lhp2.put("m012", al2);

        LinkedHashMap lhp = new LinkedHashMap();
        lhp.put("product_1", lhp1);
        lhp.put("product_2", lhp2);

        //Set<Map.Entry> entrySet=dept.entrySet();
        Set<Map.Entry> entrySet = lhp.entrySet();

        for (Map.Entry m : entrySet) {
            Object key = m.getKey();
            System.out.println("=============" + key + "=================");
            Object value = m.getValue();
            LinkedHashMap inner = (LinkedHashMap) value;
            Set<Map.Entry> set1 = inner.entrySet();
            for (Map.Entry m1 : set1) {
                Object inkey = m1.getKey();
                System.out.println("Machine number\t" + inkey + "    \n");
                Object invalue = m1.getValue();
                ArrayList innvalue = (ArrayList) invalue;
                for(Object obj : innvalue){
                    Product p = (Product) obj;
                    System.out.println("Product id   \t" + p.getId());
                    System.out.println("Product name \t" + p.getName());
                    System.out.println("-----------------------------------");
                }
                System.out.println("\n========================================");
            }


        }


    }
}


