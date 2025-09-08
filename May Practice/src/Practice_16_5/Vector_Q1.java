package Practice_16_5;

import java.util.*;

public class Vector_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in vector");
        Vector<Integer> v=new Vector<>();
        for(int i=1;i<=10;i++){
            v.add(i*12);
        }
        System.out.println(v);
    }
}
