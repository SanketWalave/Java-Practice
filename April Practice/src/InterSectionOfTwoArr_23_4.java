import java.util.*;

public class InterSectionOfTwoArr_23_4 {
    public static void main(String[] args) {
        int a[] ={1,2,2,1};
        int b[] ={2,2};
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j]){
                    flag=true;
                    break;
                }
            }
            if(flag)al.add(a[i]);
        }
        System.out.println(al);
    }
}
