import java.security.Key;
import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6};
        int b[]={11,22,33,4,5,6};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<a.length;i++){
            Integer count=map.get(a[i]);
            if(count==null){
                count=1;
            }else count++;
            map.put(a[i],count);
        }
        for(int i=0;i<b.length;i++){
            Integer count=map.get(b[i]);
            if(count==null){
                count=1;
            }else count++;
            map.put(b[i],count);
        }

        System.out.println("Union");
        for (Map.Entry<Integer,Integer> m: map.entrySet()){
            System.out.print(m.getKey()+"\t");
        }
        System.out.println("\nIntersection");
        for (Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>1){
                System.out.print(m.getKey()+"\t");
            }
        }

    }
}
