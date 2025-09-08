/*
Q6. WAP to create POJO class name as Player with id,
 name and run and input the data from keyboard and display it.
*/

import java.util.*;

class Player {
    private int pId;
    private String pName;
    private int runs;

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getpId() {
        return pId;
    }

    public int getRuns() {
        return runs;
    }

    public String getpName() {
        return pName;
    }
}

public class Player_24_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        Player p[]=new Player[size];
        for(int i=0;i< p.length;i++)
        {
            p[i]=new Player();
            System.out.println("enter player id");
            p[i].setpId(sc.nextInt());
            System.out.println("enter player name");
            p[i].setpName(sc.next());
            System.out.println("enter runs");
            p[i].setRuns(sc.nextInt());
        }
        System.out.println("==========================================");
        for(int i=0;i< p.length;i++){
            System.out.println("player id    \t"+p[i].getpId());
            System.out.println("player name  \t"+p[i].getpName());
            System.out.println("player runs  \t"+p[i].getRuns());
            System.out.println("\n================================\n");
        }

    }
}
