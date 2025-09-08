import java.util.*;
public class EmployeeLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<EMployee> ll=new LinkedList<>();
        EMployee e1=new EMployee(1,"sanket",999999);
        EMployee e2=new EMployee(2,"anuj",7566);
        EMployee e3=new EMployee(3,"om",2445);
        EMployee e4=new EMployee(4,"sak",76543);
        EMployee e5=new EMployee(5,"fghj",6554);

        ll.add(e1);
        ll.add(e2);
        ll.add(e3);
        ll.add(e4);
        ll.add(e5);
        for(EMployee e:ll){
            System.out.println(e.toString());
        }
    }
}
