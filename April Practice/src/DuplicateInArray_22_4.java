import java.util.Arrays;

public class DuplicateInArray_22_4 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,1,2,3,4};
        Arrays.sort(a);
        for(int n:a) System.out.print(n+"\t");
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
                System.out.println(a[i]);
        }
    }
}
