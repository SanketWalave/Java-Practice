package Practice_9_5;

import java.util.*;

public class Q1_Vector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v=new Vector<>();
        for (int i=1;i<=10;i++){
            v.add(i*10);
        }
        for (int i:v) System.out.print(i+"\t");
    }
}
