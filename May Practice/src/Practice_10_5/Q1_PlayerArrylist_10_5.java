package Practice_10_5;
/*Q1. Write a program to Create ArrayList and store 5 player objects
 in it and sort the player object by using id */

import java.util.*;

class Q1_Player_10_5 {
    private int id;
    private String name;
    private int run;

    public Q1_Player_10_5() {
    }

    public Q1_Player_10_5(int id, String nmae, int run) {
        this.id = id;
        this.name = nmae;
        this.run = run;
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
                        ", run=" + run;
    }

//    @Override


}

class CompareId implements Comparator<Q1_Player_10_5> {
    public int compare(Q1_Player_10_5 p1, Q1_Player_10_5 p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

public class Q1_PlayerArrylist_10_5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Q1_Player_10_5 p1 = new Q1_Player_10_5(100, "sanket", 20000);
        Q1_Player_10_5 p2 = new Q1_Player_10_5(5, "sanksset", 234500);
        Q1_Player_10_5 p3 = new Q1_Player_10_5(22, "sanksset", 206780);
        Q1_Player_10_5 p4 = new Q1_Player_10_5(43, "ankefft", 203400);
        ArrayList<Q1_Player_10_5> al = new ArrayList<>();
        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        for (Q1_Player_10_5 p : al) {
            System.out.println(p.toString());
        }
        System.out.println("================================");
//        Collections.sort(Q1_Player_10_5,new CompareId());
        Collections.sort(al, new CompareId());

        for (Q1_Player_10_5 p : al) {
            System.out.println(p.toString());
        }
    }

}
