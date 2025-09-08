class Maxsum {

    public int sum(int a[]) {
        int sum2 = Integer.MIN_VALUE;
        int sum = 0;
        for (int start = 0; start < a.length; start++) {

           sum+=a[start];
           if (sum>sum2)
               sum2=sum;
           if(sum<0)
               sum=0;
        }
        return sum2;
    }
}

public class SubarraySum_7_4 {
    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Maxsum ms = new Maxsum();
        System.out.println(ms.sum(a));


    }
}
