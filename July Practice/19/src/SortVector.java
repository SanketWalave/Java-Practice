import java.util.*;

public class SortVector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for(int i=1;i<=10;i++)v.add(i*10);

        Collections.sort(v,Collections.reverseOrder());
        System.out.println(v);
        for(int i=0;i<v.size();i++){
            for(int j=i+1;j<v.size();j++){
                if(v.get(i)>v.get(j)){
                    int temp=v.get(j);
                    v.set(j,v.get(i));
                    v.set(i,temp);
                }
            }
        }
        System.out.println(v);
    }
}
