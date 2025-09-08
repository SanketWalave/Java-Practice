package Practice_9_5;
/*Q4. WAP to create class Player with field id,
name and run and store  5 player object in ArrayList
 by using Array of object concept and perform following operation
Case 1: Add All Player
Case 2:View all Player
Case 3: Search player by using id
Case 4: delete player by using id  of player
Case 5: update name and run by using id of player
*/
import java.util.*;
class Q4_Player{
    private int id;
    private String name ;
    private int run;
    public Q4_Player(){}
    public Q4_Player(int id,String name,int run){
        this.id=id;
        this.name=name;
        this.run=run;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", run=" + run ;
    }
}
public class Q4_PAlayerList_9_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Q4_Player> al=new ArrayList<>();
        do {
            System.out.println("Enter your choice \n" +
                    "Case 1: Add All Player \n" +
                    "Case 2:View all Player \n" +
                    "Case 3: Search player by using id \n" +
                    "Case 4: delete player by using id  of player\n" +
                    "Case 5: update name and run by using id of player\n"+
                    "case 6: exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter player isd");
                    int id=sc.nextInt();
                    System.out.println("Enter player name");
                    String name=sc.next();
                    System.out.println("Enter player runs");
                    int runs= sc.nextInt();;
                    Q4_Player p=new Q4_Player(id,name,runs);
                    al.add(p);
                    break;
                case 2:
                    for(Q4_Player p1:al) System.out.println(p1.toString());
                    break;
                case 3:
                    System.out.println("enter player isd");
                     id=sc.nextInt();
                    for(Q4_Player p1:al){
                        if(p1.getId()==id) System.out.println(p1.toString());
                    }
                    break;
                case 4:
                    System.out.println("enter player isd");
                    id=sc.nextInt();
                    Iterator it=al.iterator();
                    while (it.hasNext()){
                        Object obj=it.next();
                        Q4_Player p2=(Q4_Player) obj;
                        if(p2.getId()==id){
                            it.remove();
                        }
                    }
                    break;
                case 5:
                    System.out.println("enter player isd");
                    id=sc.nextInt();
                    for(Q4_Player p1:al){
                        if(p1.getId()==id) {
                            System.out.println("Enter player name");
                            p1.setName(sc.next());
                            System.out.println("Enter player runs");
                             p1.setRun(sc.nextInt());
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }

        }while (true);

    }
}
