package Practice_11_5;
/*Q1. WA Program to create a Map and perform the following operation on it?
 	Case 1: store data in map integer as key and string as value
	Case 2: fetch data from map using its key
	Case 3: delete data from map using its key
	Case 4: update data from map using its key
	Case 5: Search data from map using its key
	Case 6: fetch data from map using Map.entrySet
*/
import java.util.*;
public class Q1_Map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> hm=new HashMap<>();
        do {
            System.out.println("Enter your choice\n" +
                    " \tCase 1: store data in map integer as key and string as value\n" +
                    "\tCase 2: fetch data from map using its key\n" +
                    "\tCase 3: delete data from map using its key\n" +
                    "\tCase 4: update data from map using its key\n" +
                    "\tCase 5: Search data from map using its key\n" +
                    "\tCase 6: fetch data from map using Map.entrySet\n"+
                    "\tcase 7: exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter key");
                    try {
                        int key = sc.nextInt();
                        sc.nextLine();
                        System.out.println("enter value");
                        String value = sc.nextLine();
                        hm.put(key,value);
                    } catch (Exception e) {
                        System.out.println("\n"+e+"\n");
                    }

                    break;
                case 2:
                    System.out.println("enter key to feth data");
                    int key= sc.nextInt();
                    for(Map.Entry<Integer,String> m: hm.entrySet()){
                        if(m.getKey()==key){
                            System.out.println("key   = "+m.getKey());
                            System.out.println("value = "+m.getValue());
                            System.out.println("\n=======================\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("enter key");
                    key= sc.nextInt();
                    Iterator<Map.Entry <Integer,String>>im=hm.entrySet().iterator();
                    while (im.hasNext())
                    {
                        Map.Entry<Integer,String> m=im.next();
                        if(key==m.getKey())im.remove();
                    }
                    break;
                case 4:
                    System.out.println("enter key");
                    key= sc.nextInt();
                   if(hm.containsKey(key)){
                       System.out.println("enter new value");
                       sc.nextLine();
                       hm.put(key,sc.nextLine());
                   }
                    break;
                case 5:
                    System.out.println("enter key");
                    key= sc.nextInt();
                   im=hm.entrySet().iterator();
                    while (im.hasNext())
                    {
                        Map.Entry<Integer,String> m=im.next();
                        if(key==m.getKey()) {
                            System.out.println("key   = "+m.getKey());
                            System.out.println("value = "+m.getValue());
                            System.out.println("\n=======================\n");
                        }
                    }
                    break;
                case 6:
                    for(Map.Entry<Integer,String> m:hm.entrySet()){
                        System.out.println("key   = "+m.getKey());
                        System.out.println("value = "+m.getValue());
                        System.out.println("\n=======================\n");
                    }
                    break;
                case 7:
                        System.exit(0);
                    break;
                default:
                    System.out.println("\ninvalid choice\n");
                    break;
            }

        }while (true);

    }
}
