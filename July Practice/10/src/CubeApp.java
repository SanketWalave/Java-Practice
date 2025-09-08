import java.util.*;
class Cube{
    private int num;
    public void setValue(int num){
        this.num=num;
    }
    public int getCube(){
        return num*num*num;
    }
}
public class CubeApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        Cube c=new Cube();
        c.setValue(sc.nextInt());
        System.out.println("cube is \t"+c.getCube());
    }
}
