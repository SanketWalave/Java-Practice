package Practice_16_5;

import java.util.*;

/*Q1. WA Program to create a Map and perform the following operation on it?
 	Case 1: store data in map integer as key and string as value
	Case 2: fetch data from map using its key
	Case 3: delete data from map using its key
	Case 4: update data from map using its key
	Case 5: Search data from map using its key
	Case 6: fetch data from map using Map.entrySet
*/
public class ProductMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();


        do {
            System.out.println("enter your choice\n" +
                    " \tCase 1: store data in map integer as key and string as value\n" +
                    "\tCase 2: fetch data from map using its key\n" +
                    "\tCase 3: delete data from map using its key\n" +
                    "\tCase 4: update data from map using its key\n" +
                    "\tCase 5: Search data from map using its key\n" +
                    "\tCase 6: fetch data from map using Map.entrySet " +
                    "\tCase 7: exit ");

            try {
               int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("enter key");
                        int key = sc.nextInt();
                        System.out.println("enter string");
                        sc.nextLine();
                        String name = sc.nextLine();
                        map.put(key, name);
                        break;
                    case 2:
                        boolean flag = true;
                        System.out.println("enter key");
                        key = sc.nextInt();
                        for (Map.Entry<Integer, String> m : map.entrySet()) {
                            if (key == m.getKey()) {
                                System.out.println("key = " + m.getKey() + "\nvalue = " + m.getValue());
                                flag = false;
                                break;
//                            break;
                            }
                        }
                        if (flag) System.out.println("not found");
                        break;
                    case 3:
                        flag = true;
                        System.out.println("enter key");
                        key = sc.nextInt();
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> m = it.next();
                            if (key == m.getKey()) {
                                flag = false;
                                it.remove();
                            }
                        }
                        if (flag) System.out.println("not found");

                        break;
                    case 4:
                        flag = true;
                        System.out.println("enter key");
                        key = sc.nextInt();
                        for (Map.Entry<Integer, String> m : map.entrySet()) {
                            if (key == m.getKey()) {
                                System.out.println("enter bew string to update");
                                sc.nextLine();
                                name = sc.nextLine();
                                map.put(key, name);
                                flag = false;
                                break;
//                            break;
                            }
                        }
                        if (flag) System.out.println("not found");
                        break;
                    case 5:

                        break;
                    case 6:
                        for (Map.Entry<Integer, String> m : map.entrySet())
                            System.out.println("key   = " + m.getKey() + "\nvalue = " + m.getValue());
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\ninvalid\n");
                        break;
                }
            }catch (Exception e){
                System.out.println(e);
                sc.nextLine();
            }
        } while (true);

    }
}
