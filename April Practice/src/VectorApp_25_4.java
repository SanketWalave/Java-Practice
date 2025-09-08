/*Q1.WAP to create Vector class and store 5 values in it and display vector data using a following methods

Show the vector data using Enumeration
Show the vector data using Iterator
Show the vector data using normal for loop
Show the vector data using foreach
Show the vector data using ListIterator
*/
import java.util.*;
public class VectorApp_25_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter data in vector");
        Vector<Integer> v=new Vector<>();
        for(int i=0;i<5;i++)v.add(sc.nextInt());
        System.out.println("itrator");
        Iterator iv=v.iterator();
        while (iv.hasNext()){
            Object obj=iv.next();
            int n=(int)obj;
            System.out.print(n+"\t");
        }
        System.out.println("\nnormal for");
        for(int i=0;i<v.size();i++) System.out.print(v.get(i)+"\t");
        System.out.println("\nforeach");
        for(int n:v) System.out.print(n+"\t");
        System.out.println("\nlistitratoe");
        ListIterator liv=v.listIterator();
        while (liv.hasNext())
        {
            Object obj=liv.next();
            int n=(int) obj;
            System.out.print(n+"\t");
        }
        System.out.println();
//        ListIterator liv=v.listIterator();
        while (liv.hasPrevious())
        {
            Object obj=liv.previous();
            int n=(int) obj;
            System.out.print(n+"\t");
        }
        System.out.println("\nenumration");
        Enumeration eiv=v.elements();
        while (eiv.hasMoreElements()){
            Object obj=eiv.nextElement();
            int n=(int)obj;
            System.out.print(n+"\t");
        }
    }
}
