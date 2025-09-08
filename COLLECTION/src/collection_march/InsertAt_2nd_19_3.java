package collection_march;
import java.util.*;
public class InsertAt_2nd_19_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector();
        for(int i=0;i<5;i++)
        {
            v.add(sc.nextLine());
        }
        v.add(2,sc.nextLine());
        System.out.println(v);
    }
}
