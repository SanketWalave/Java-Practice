import java.util.*;
/*Q 2)  Rotate Array by K Steps (Right Rotation)
Question:
 Given an array, rotate the array to the right by k steps.
Example:
 Input: [1, 2, 3, 4, 5, 6, 7], k = 3
 Output: [5, 6, 7, 1, 2, 3, 4]
*/
public class RotetArray_2_29_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int a[]=new int[sc.nextInt()];
        System.out.println("enter element in array");
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        System.out.println(Arrays.toString(a));
        System.out.println("enter rotation");
//        System.out.println(Arrays.toString(rotateArray(sc.nextInt(),a)));
        rotateArray(sc.nextInt(),a);
        System.out.println(Arrays.toString(a));
    }
    public static void rotateArray(int k,int a[]){
//      for(int j=1;j<=k;j++){
//          int temp= a[a.length-1];
//          for(int i=a.length-1;i>0;i--){
//              a[i]=a[i-1];
////              System.out.println(Arrays.toString(a));
//          }
//          a[0]=temp;
////      }
//        if(a.length==1)return ;
//
//        if(k%a.length==0)return ;
//
//        int res[]=getReverse(a,0,a.length-1);
//        System.out.println("reverse full "+Arrays.toString(res));
//        res=getReverse(res,0,k-1);
//        System.out.println("first reverse "+Arrays.toString(res));
//        res=getReverse(res,k,res.length-1);
//
//      a=res;
//
//    }
//    public static int [] getReverse(int a[],int st,int end){
//        while (st<end){
//            int temp=a[st];
//            a[st]=a[end];
//            a[end]=temp;
//            st++;
//            end--;
//        }
//        return a;
//    }
     if(a.length==1)return ;
    k=k%a.length;
        if(k==0)return ;

    // int res[]=getReverse(a,0,a.length-1);
    // System.out.println("reverse full "+Arrays.toString(res));
    // res=getReverse(res,0,k-1);
    // System.out.println("first reverse "+Arrays.toString(res));
    // res=getReverse(res,k,res.length-1);
    getReverse(a,0,a.length-1);
    getReverse(a,0,k-1);
    getReverse(a,k,a.length-1);
    //   a=res;

}
        public static void getReverse(int a[],int st,int end){
            while (st<end){
                int temp=a[st];
                a[st]=a[end];
                a[end]=temp;
                st++;
                end--;
            }
            // return a;
        }
}
