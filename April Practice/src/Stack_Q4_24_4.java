/* Q4. WAP to create a stack and perform the following operation on it.
	Case1: push data in stack
	Case 2: pop data from stack
	Case 3: display all data from stack
*/

import java.util.*;

public class Stack_Q4_24_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        do{
            System.out.println(" Enter your choice\n" +
                    "\tCase1: push data in stack\n" +
                    "\tCase 2: pop data from stack\n" +
                    "\tCase 3: display all data from stack"+
                    "\tCase 4: exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter intiger");
                    st.push(sc.nextInt());
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    System.out.println(st);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            System.out.println(st);
        }while (true);
    }
}
