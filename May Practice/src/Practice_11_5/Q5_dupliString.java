package Practice_11_5;
/*Q5. WAP to input string data from the keyboard and find the
duplicate words from the string.
 */
import java.util.*;
public class Q5_dupliString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        String s[]=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length;i++){
            Object obj=map.get(s[i]);
            Integer count=(Integer) obj;
            if(count==null){
                count=0;
            }
            count++;
            map.put(s[i],count);
        }
//        System.out.println(map);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
