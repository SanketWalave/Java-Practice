package Practice_11_5;
/*Q2. WAP to create array of integer values and store  10 values in
array and find the occurrence of every element in array by using HashMap
 */
import java.util.*;
public class Q2_Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter elements in array");
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        for(int n:a) System.out.print(n+"\t");
        System.out.println();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            Object obj=map.get(a[i]);
            Integer count=(Integer) obj;
            System.out.println(count +" ccc");
            if(count == null){
                count=0;
            }
            count++;
            map.put(a[i],count);
        }
        System.out.println(map);
    }
}
