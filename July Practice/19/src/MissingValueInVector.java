import java.util.*;

public class MissingValueInVector {
    public static void main(String[] args) {
//        Vector<Integer> v=new Vector<>();
//        for(int i=1;i<=10;i+=2)v.add(i*3);
//        System.out.println(v);
//        for(int i=0;i<v.size()-1;i++){
//            if(v.get(i+1)-v.get(i)>1){
//                for(int j=v.get(i)+1;j<v.get(i+1);j++){
//                    System.out.print(j+" ");
//                }
//            }
//        }

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add(1, "Three");
        System.out.println(list);



    }
}
