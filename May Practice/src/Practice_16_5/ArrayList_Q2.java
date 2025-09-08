package Practice_16_5;
/*
* Q2. WAP to create an ArrayList and perform the following operation on it.
Case 1:  add new element
Case2: view all element
Case 3: search value using indexOf()
Case4: Search element using get()
Case5:delete element using index
case 6; check size
case 7: check ArrayList is empty or not
*/
import java.util.*;

public class ArrayList_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        do {
            System.out.println("Case 1:  add new element\n" +
                    "Case2: view all element\n" +
                    "Case 3: search value using indexOf()\n" +
                    "Case4: Search element using get()\n" +
                    "Case5:delete element using index\n" +
                    "case 6; check size\n" +
                    "case 7: check ArrayList is empty or not\n"+
                    "case 8: exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    al.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("\n\n"+al+"\n\n");
                    break;

                case 3:
                    System.out.println("enter value to search");
                    int index=al.indexOf(sc.nextInt());
                    if(index==-1) System.out.println("element not found");
                    else System.out.println("element found at index "+index);
                    break;

                case 4:
                    System.out.println("enter value");
                    int val=sc.nextInt();
                    boolean flag=true;
                    for(int i=0;i<al.size();i++)
                    {
                        if(val==al.get(i)) {
                            System.out.println("element found");
                            flag=false;
                          break;
                        }
                    }
                    if(flag) System.out.println("element not found");
                    break;

                case 5:
                    System.out.println("enter value");
                    val=sc.nextInt();
                    flag=true;
                    Iterator<Integer> it=al.iterator();
                    while (it.hasNext()){
                        if(val==it.next())it.remove();flag=false;

                    }
                    if(flag) System.out.println("element not found");
                    break;
                case 6:
                    System.out.println("\n\n"+al.size()+"\n\n");
                    break;

                case 7:
                    System.out.println("\n\n"+al.isEmpty()+"\t\t");
                    break;

                case 8:
                    System.exit(0);
                    break;

            }
        }while(true);
    }
}
