package Comparable;


import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        Player pl=(Player) o;
        if(this.id> pl.id)return 1;
        else if (this.id<pl.id) return -1;
        else return 0;
    }
//    public int compareTo(Object o) {
//        Player pl=(Player) o;
//        if(this.run> pl.run)return 1;
//        else if (this.run<pl.run) return -1;
//        else return 0;
//    }
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

        System.out.println("players after sorting");
        Collections.sort(al);
        for(Player p:al) System.out.println(p.toString());


    }
}
