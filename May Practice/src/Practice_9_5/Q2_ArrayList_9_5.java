package Practice_9_5;
/*Q2. WAP to create an ArrayList and perform the following
operation on it.
Case 1:  add new element
Case2: view all element
Case 3: search value using indexOf()
Case4: Search element using get()
Case5:delete element using index
case 6; check size
case 7: check ArrayList is empty or not
*/
import java.util.*;
public class Q2_ArrayList_9_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        do {
            System.out.println("Enter your choice.\n" +
                    "Case 1:  add new element \n" +
                    "Case2: view all element \n" +
                    "Case 3: search value using indexOf()\n" +
                    "Case4: Search element using get()\n" +
                    "Case5:delete element using index\n" +
                    "case 6; check size\n" +
                    "case 7: check ArrayList is empty or not\n"+
                    "case 8: exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter element");
                    al.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println(al);
                    break;
                case 3:
                    int value=sc.nextInt();
                    int index=al.indexOf(value);
                    if(index!=-1){
                        System.out.println("Index of "+value+" is "+index);
                    }
                    else {
                        System.out.println("element not found");
                    }
                    break;
                case 4:
                    value=sc.nextInt();
                     index=-1;
                     for (int i=0;i<al.size();i++){
                         if(al.get(i)==value)index=i;
                     }
                    if(index!=-1){
                        System.out.println("Index of "+value+" is "+index);
                    }
                    else {
                        System.out.println("element not found");
                    }
                    break;
                case 5:
                    value=sc.nextInt();
                    index=al.indexOf(value);
                    int  res=al.remove(index);

                    if(index!=-1){
                        System.out.println("remove sucsesfully ");
                    }
                    else {
                        System.out.println("element not found");
                    }
                    break;
                case 6:
                    System.out.println(al.size());
                    break;
                case 7:
                    if(al.isEmpty()) System.out.println("is empty");
                    else System.out.println("arraylist not empty");
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
