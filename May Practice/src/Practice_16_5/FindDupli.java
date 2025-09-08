package Practice_16_5;

import java.util.HashMap;
import java.util.Map;

public class FindDupli {
    public static void main(String[] args) {
        int []a={1,1,1,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,3,2,3,44,55,33};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            Object obj=map.get(a[i]);
            Integer count=(Integer) obj;
            if(count==null)count=1;
            else count++;
//            count++;
            map.put(a[i],count);
        }
        System.out.println("==================");
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
//            System.out.println(" number= "+m.getKey()+"\t\toccurrance = "+m.getValue());
            if(m.getValue()>1) System.out.println(m.getKey());
        }
    }
}
