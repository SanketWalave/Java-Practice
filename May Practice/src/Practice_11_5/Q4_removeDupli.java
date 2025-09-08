package Practice_11_5;
/*Q4.WAP to create array of integer values and store  10 values in array and
 remove the duplicate values from  array by using HashMap*/
import java.util.*;
public class Q4_removeDupli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter elements in array");
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        for(int i:a) System.out.print(i+"\t");
        System.out.println();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            Object obj=map.get(a[i]);
            Integer count=(Integer) obj;
            if(count==null)count=0;
            count++;
            map.put(a[i],count);
        }
//        System.out.println(map);
        Iterator<Map.Entry<Integer,Integer>> ent=map.entrySet().iterator();
        while (ent.hasNext()){
                Map.Entry<Integer,Integer> e=ent.next();
                if(e.getValue()>1){
                    ent.remove();
                }
        }
        System.out.println("after removing duplicate element");
//        System.out.println(map);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
        }

    }
}//1	2	3	4	5	6	1	2	3	4
