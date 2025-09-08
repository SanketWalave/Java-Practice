import java.util.*;

public class ReverseVector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for(int i=1;i<=10;i++)v.add(i*10);
        System.out.println(v);
        Collections.reverse(v);
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);
//        for(int i=2;i<=10;i+=2)v.add(i*10);
//        System.out.println(v);
//        int end=v.size()-1;
//        for(int i=0;i<v.size()/2;i++){
//            int temp=v.get(i);
//            v.set(i,v.get(end));
//            v.set(end,temp);
//            end--;
//        }
//        System.out.println(v);

    }
}
