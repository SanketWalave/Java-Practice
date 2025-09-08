package collection_march;
/*Q2. Write a program to reverse the elements of a Vector<Character> without using built-in methods*/

import java.util.*;

public class VectorRev_19_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        v.add(10);
        v.add(100);
        v.add(1000);
        v.add(10000);

        int end = v.size() - 1;
        for (; end >= 0; end--) {
            System.out.print(v.get(end));
            System.out.print(" ");
        }
    }
}
