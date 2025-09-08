package Q9;

import java.util.*;
/*Q9. Create a program that stores department names and the list of employees working in
each department using a HashMap<String, List<String>>. The program should:
• Accept department name and employee name entries.
• Group employees under their respective departments.
• Display all departments and the employees under them. */

public class MAping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,List<String>> map=new HashMap<>();
        boolean flag=true;
        do {
            System.out.println("enter department");
            String dept=sc.nextLine();
            List<String> al=new ArrayList<>();
            System.out.println("enter employee names");
            boolean inflag=true;
            while (inflag){
                al.add(sc.nextLine());
                System.out.println("\nenter 1 if you want to stop");
                try {
                    int num = sc.nextInt();
                    if (num == 1) inflag = false;
                    sc.nextLine();
                }catch (Exception e){
//                    sc.nextLine();
                }
            }
            map.put(dept,al);
            System.out.println("\nenter 1 if you want to stop");
            try {
                int num = sc.nextInt();
                if (num == 1) flag = false;
                sc.nextLine();
            }catch (Exception e){
//                sc.nextLine();
            }

        }while (flag);
        for(Map.Entry<String,List<String>> m:map.entrySet()){
            System.out.println("============== "+m.getKey()+" =============");
            ArrayList<String> inal=(ArrayList<String>) m.getValue();
            System.out.println("employee names");
            for(String s:inal){
                System.out.println("\t\t"+s);
            }
        }
    }
}
