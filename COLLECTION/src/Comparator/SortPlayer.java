package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Player {
    private int id;
    private String name;
    private int run;

    public Player() {
    }

    public Player(int id, String nmae, int run) {
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
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getRun() {
        return this.run;
    }

    public String toString() {
        return "id=" + this.id + ", name='" + this.name + "', run=" + this.run;
    }


}
class CompareById implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getId()-o2.getId();
    }
}
public class SortPlayer {
    public static void main(String[] args) {
        ArrayList<Player> al=new ArrayList<>();
        al.add(new Player(5,"sanket",99999));
        al.add(new Player(4,"san",234));
        al.add(new Player(1,"sanket",234));
        al.add(new Player(2,"sket",345));
        al.add(new Player(3,"sant",786));
//        displaying players before sorting
        for(Player p:al) System.out.println(p.toString());

        System.out.println("players after sorting\n\n");

        Collections.sort(al,new CompareById());

        for(Player p:al) System.out.println(p.toString());
    }
}
