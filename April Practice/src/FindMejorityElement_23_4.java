import java.util.*;
public class FindMejorityElement_23_4 {
    public static void main(String[] args) {
        int a[]={3, 3, 3, 3, 4,3, 2, 4, 4};
        int res=getMejority(a);
        if(res==-1)
            System.out.println("no mejority element");
        else System.out.println(res);
    }
    public static int getMejority(int a[])
    {
        int mejority=a.length/2;
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1]){
                count++;
                if(count>=mejority)
                    return a[i];
            }
            else if(a[i]!=a[i+1]) count=0;
        }
        return -1;
    }
}
