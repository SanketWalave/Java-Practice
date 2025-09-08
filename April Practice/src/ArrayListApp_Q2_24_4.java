/*Q2. WAP to create ArrayList and perform following operation
on it
Case 1: add new data in ArrayList
Case 2: view all data from ArrayList
Case 3: Search Data using contains method
Case 4: Search data using indexOf() method
Case 5: delete data using index
Case 6: count total number of element from ArrayList
Case 7: check ArrayList  is empty or not
*/
import java.util.*;
public class ArrayListApp_Q2_24_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        do {
            System.out.println("enter your choice");
            System.out.println("Case 1: add new data in ArrayList\n" +
                    "Case 2: view all data from ArrayList\n" +
                    "Case 3: Search Data using contains method \n" +
                    "Case 4: Search data using indexOf() method \n" +
                    "Case 5: delete data using index\n" +
                    "Case 6: count total number of element from ArrayList\n" +
                    "Case 7: check ArrayList  is empty or not\n "+
                    "case 8:exit");
                int choice=sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("enter data");
                        al.add(sc.nextInt());
                        break;
                    case 2:
                        System.out.println(al);
                        break;
                    case 3:
                        System.out.println("enter sky");
                        int skey=sc.nextInt();
                        if(al.contains(skey)) System.out.println("found");
                        else System.out.println("not found");
                        break;
                    case 4:
                        System.out.println("enter skey");
                        int sky=al.indexOf(sc.nextInt());
                        if(sky==-1) System.out.println("element not found");
                        else System.out.println("element found ay index "+sky);

                        break;
                    case 5:
                        System.out.println(al);
                        System.out.println("enter skey");
                        skey=sc.nextInt();
                        int skyy=al.indexOf(skey);
                        if(skyy==-1) System.out.println("element not found");
                        else {
                            al.remove(skey);
                        }
                        System.out.println(al);
                        break;
                    case 6:
                        System.out.println(al.size());
                        break;
                    case 7:
                        String res=al.isEmpty()?"is empty":"not empty";
                        System.out.println(res);
                        break;
                    case 8:
                        System.exit(0);
                        break;
                }
        }while (true);
    }
}
