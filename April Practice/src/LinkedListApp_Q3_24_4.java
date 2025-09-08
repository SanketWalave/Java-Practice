/*
*  Q3. WAP to create LinkedList and perform the following operation on it.
	Case 1: add Node at first
	Case 2: add Node at last
	Case 3: remove node from first
	Case 4: remove node from last
	Case 5: view all data from linked list
*/


import java.util.*;
public class LinkedListApp_Q3_24_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        do {
            System.out.println("Enter your choice\n" +
                    "\tCase 1: add Node at first \n" +
                    "\tCase 2: add Node at last \n" +
                    "\tCase 3: remove node from first \n" +
                    "\tCase 4: remove node from last \n" +
                    "\tCase 5: view all data from linked list"+
                    "\tcase 6:exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter number");
                    ll.addFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.println("enter integer");
                    ll.addLast(sc.nextInt());
                    break;
                case 3:
                    System.out.println(ll.removeFirst());
                    break;
                case 4:
                    System.out.println(ll.removeLast());
                    break;
                case 5:
                    System.out.println(ll);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
            System.out.println(ll);
        }while (true);
    }
}
