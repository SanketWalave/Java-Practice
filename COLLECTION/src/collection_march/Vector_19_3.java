package collection_march;

import java.util.*;

public class Vector_19_3 {
    public static void main(String[] args) {
        Vector v=  new Vector();
        v.add("first");
        v.add(100);
        v.add(10000);

       Vector v2=new Vector();
//        v2.add(30);
//        v2.add(30);
        v2.add("first");
        v2.add(1000);
        v2.add(100);



        boolean b=v.containsAll(v2);
        System.out.println(b);
        System.out.println(v);
        System.out.println(v2);

//        v.addAll(v2);
//        boolean b=v.add(null);
//        System.out.println(b);
//        System.out.println(v.size());
//        System.out.println("vector before remove \n"+v);
//        v.remove("");
//        System.out.println("vector after remove \n"+v);
//        System.out.println(v.size());

//        System.out.println(v.firstElement());
//        System.out.println(v.lastElement());
    }
}
