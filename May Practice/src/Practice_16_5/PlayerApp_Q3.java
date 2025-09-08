package Practice_16_5;

import Practice_9_5.*;

import java.util.ArrayList;
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
public class PlayerApp_Q3 {
    public static void main(String[] args) {
        ArrayList<Q4_Player> al=new ArrayList<>();
        al.add(new Q4_Player(1,"dev",1234));
        al.add(new Q4_Player(2,"atul",23));
        al.add(new Q4_Player(3,"god",98));
        al.add(new Q4_Player(4,"don",543));

        for(Q4_Player p:al) System.out.println(p.toString());
    }
}
