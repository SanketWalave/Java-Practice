import java.util.*;
public class Arl {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        for (int i=1;i<11;i++){
            al.add(i*10);
        }

        ListIterator li= al.listIterator();
        while (li.hasPrevious()){
            Object obj=li.hasPrevious();
            System.out.println(obj);
        }
    }
}
