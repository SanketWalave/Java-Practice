import java.util.*;

/*Q5. Write  Program to perform method overriding you have to create class name as ArrParent with
method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence
You have to create two child class name as ArrangeAscendingOrder and you have to inherit
ArrParent class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and
display in ascending order and you have to create one more class name ReverseArray and override
arrangeSeq() method from ArrParent and reverse array and display it. */
class ArrayParent{
    protected int []a;
    public void setValue(int []a){
        this.a=a;
    }
    public void arrSeq(){
        System.out.println(Arrays.toString(a));
    }
}
class Assending extends ArrayParent{
    @Override
    public void arrSeq() {
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
class Reverse extends ArrayParent{
    @Override
    public void arrSeq() {
        int end=a.length-1;
        for(int i=0;i<a.length/2;i++){
            int temp=a[end];
            a[end]=a[i];
            a[i]=temp;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }

}
public class ArrayOp {
    public static void main(String[] args) {
        ArrayParent ap=new ArrayParent();
        ap.setValue(new int[]{1,2,3,4,5,6});
        ap.arrSeq();
        ap=new Assending();
        ap.setValue(new int[]{1,2,3,4,5,6});
        ap.arrSeq();
        ap=new Reverse();
        ap.setValue(new int[]{1,2,3,4,5,6});
        ap.arrSeq();
    }
}
