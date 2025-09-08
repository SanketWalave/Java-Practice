import java.util.*;


public class Kth_smallest_21_4 {
    public static void main(String[] args) {
        int a[]={12,3,5,7,19};
        System.out.println(getKthSm(a,2));
    }

    public static int getKthSm(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//        for(int n:a)
//            System.out.print(n+"\t");
        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                count++;
                if(count==k) return a[i];
            }
        }
        return 0;
    }
}
