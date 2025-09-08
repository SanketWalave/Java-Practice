package Practice_11_5;
/*Q3. WAP to create array of integer values and store  10 values in array and
find the duplicate element from  array by using HashMap*/
import java.util.*;
public class Q3_MapDupli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter elements in ");
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        for(int i:a) System.out.print(i+"\t");

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            Object obj=map.get(a[i]);
            Integer count=(Integer) obj;
            if(count == null){
                count=0;
            }
            count++;
            map.put(a[i],count);
//
        }
        System.out.println("\n"+map);
//        Map.Entry<Integer,Integer> enter=map.entrySet();
        for( Map.Entry<Integer,Integer> enter:map.entrySet()){
            if(enter.getValue()>1){
                System.out.println(enter.getKey());
            }
        }
    }
}
