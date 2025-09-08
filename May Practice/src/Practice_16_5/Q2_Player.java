package Practice_16_5;


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


public class Q2_Player {
    public static void main(String[] args) {
//        Q1_Player_10_5 p=new Q1_Player_10_5();
    }
}
