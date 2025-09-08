import java.util.Arrays;

public class LongestConSeq_128 {
    public static void main(String[] args) {
//        int a[]={100,4,200,1,3,2};
        int a[]={0};
        System.out.println(longestConsecutive(a));
    }
    public static int longestConsecutive(int []a){
        int count=1;
        int bcount=1;
        Arrays.sort(a);
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1] ){
                continue;
            } else if(a[i]-a[i-1]==1){
                count++;
            }else {
                count=1;
            }

            if(bcount<count){
                bcount=count;
            }
        }
        return bcount;
    }
}
