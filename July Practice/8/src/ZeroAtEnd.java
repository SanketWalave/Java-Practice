import java.util.Arrays;

public class ZeroAtEnd {
    public static void main(String[] args) {
//        Input: [0, 1, 0, 3, 12]
//        Output: [1, 3, 12, 0, 0]
        int a[]={0, 1, 0, 3, 12,0,0,55,77,8};

        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                System.out.println(Arrays.toString(a));
                a[a.length-1]=0;


            }
        }
        System.out.println(Arrays.toString(a));
    }
}
