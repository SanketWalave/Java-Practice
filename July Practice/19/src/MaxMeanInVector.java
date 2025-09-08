import java.util.*;

public class MaxMeanInVector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for(int i=1;i<=10;i++)v.add(i*10);
//        System.out.println(Collections.max(v));
//        System.out.println(Collections.min(v));
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<v.size();i++){
            if(v.get(i)>max) max=v.get(i);
        }
        for(int i=0;i<v.size();i++){
            if(v.get(i)<min) min=v.get(i);
        }
        System.out.println(max);
        System.out.println(min);
    }
}
