import java.util.*;

/*Q1. WAP to create a Vector and store  5 values in it and
 perform the following task?

	Case 1: add new element
	Case 2: view element
	Case 3: Search Element
    Case 4: remove element using index
*/
public class VectorAPP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v=new Vector<>();
        do {
            System.out.println("Case 1: add new element \n" +
                    "\tCase 2: view element\n" +
                    "\tCase 3: Search Element \n" +
                    "\tCase 4: remove element using index\n"+
                    "\tcase 5:exit");
            System.out.println("enter your choice");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter number");
                    v.add(sc.nextInt());
                    break;
                case 2:
                    Iterator<Integer> it=v.iterator();
                    while (it.hasNext()){
                        System.out.println(it.next());
                    }
                    break;
                case 3:
                    System.out.println("enter element to search");
                    boolean index=v.contains(sc.nextInt());
                    if(index) System.out.println("cointain element");
                    else System.out.println("not present");
                    break;
                case 4:
                    System.out.println("enter element");
                    int ind=v.indexOf(sc.nextInt());
                    if(ind!=-1){
                        v.remove(ind);
                        System.out.println("element deleted");
                    }else {
                        System.out.println("element not found");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
