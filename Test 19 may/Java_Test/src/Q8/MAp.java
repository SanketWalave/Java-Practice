package Q8;

import java.util.*;

public class MAp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        String s[]=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length;i++){
            Object obj=map.get(s[i]);
            Integer count=(Integer) obj;
            if(count==null)count=1;
            else count++;
            map.put(s[i],count);
        }
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+"  count = "+m.getValue());
        }
    }
}
