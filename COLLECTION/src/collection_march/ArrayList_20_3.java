package collection_march;
import java.util.*;
/*Q 1. Write a java program to create arraylist and perform following operations using switch case and do while.

		1. Add 10 Values In Arraylist.
		2. Display All Values In Arraylist.
		3. Add New Value In Arraylist.
		4. Search Value In Arraylist.
		5. Sort All Values In Ascending Order In Arraylist.
		6. Sort All Values In Descending Order In Arraylist.
		7. Find Max Value In Arraylist.
		8. Find Min Value In Arraylist.
		9. Update Value In Arraylist.
		10. Delete Value In Arraylist.
*/
public class ArrayList_20_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList();
        do{
            System.out.println("which operation you want to perform");
            System.out.println("1. Add 10 Values In Arraylist");
            System.out.println("2. Display All Values In Arraylist.");
            System.out.println("3. Add New Value In Arraylist.");
            System.out.println("4. Search Value In Arraylist.");
            System.out.println("5. Sort All Values In Ascending Order In Arraylist.");
            System.out.println("6. Sort All Values In Descending Order In Arraylist.");
            System.out.println("7. Find Max Value In Arraylist.");
            System.out.println("8. Find Min Value In Arraylist.");
            System.out.println("9. Update Value In Arraylist.");
            System.out.println("10. Delete Value In Arraylist.");
            System.out.println("==============================================================");
            System.out.println("Enteryour choice");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    for(int i=0;i<10;i++)
                    {
                        al.add(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.println(al);
                    break;
                case 3:
                    al.add(sc.nextInt());
                    break;
                case 4:
                    System.out.println("enter value to search");
                    int value=sc.nextInt();
                    if(al.contains(value))
                        System.out.println("value found");
                    else
                        System.out.println("value not found");
                    break;
                case 5:
                    Collections.sort(al);
                    System.out.println(al);
                    break;
                case 6:
                    Collections.sort(al,Collections.reverseOrder());
                    System.out.println(al);
                    break;
                case 7:
                    System.out.println(Collections.max(al));
                    break;
                case 8:
                    System.out.println( Collections.min(al));
                    break;
                case 9:
                    System.out.println(al);
                    System.out.println("enter endex of value which you want to update");
                    int ind=sc.nextInt();
                    System.out.println("enter value");
                    value=sc.nextInt();
                    al.add(ind,value);
                    System.out.println(al);
                    break;
                case 10:
                    System.out.println("enter index to remove value");
                    ind =sc.nextInt();
                    al.remove(ind);
                    System.out.println(al);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:

                    break;

            }
        }while (true);
    }
}
