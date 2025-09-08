package Q4;

import java.util.Scanner;

/*Q4. create class name as ArrayOperation with function name as setArray() and create its
Two child classes name as Unique , MergeArray. We need to inherit the ArrayOperation
class in Unique , MergeArray and create function and write the logic.
1. Unique Class : -
Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
Output : All unique elements in the array are: 3, 20, 12, 10 2.
2. MergeArray class :-
Input -First Array :- 1 2 3 4 5 Second Array :- 6 7 8 9 10
Output - 1 10 2 9 3 8 4 7 5 6 */
class ArrayOperation{
    protected  int []a;
    protected  int []b;
    public void setArray(int []a,int []b){
        this.a=a;
        this.b=b;
    }
    public void setArray(int []a){
        this.a=a;
    }
}
class Unique extends ArrayOperation{
    public void getResult(){
        System.out.println(" unique elements array");
        for(int i=0;i<a.length;i++){
            boolean flag=true;
            for (int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.print(a[i]+"\t");
        }
    }
    public void getResult1(){
        System.out.println("first array");
        for(int i=0;i<a.length;i++ ){
            System.out.print(a[i]+"\t");

        }
        System.out.println("\nsecond array");
        for(int i=0;i<b.length;i++ ){
            System.out.print(b[i]+"\t");

        }
        System.out.println(" \nunique elements array");
        for(int i=0;i<a.length;i++){
            boolean flag=true;
            for (int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.print(a[i]+"\t");
        }
    }
}
class MergeArray extends ArrayOperation{
    public void getResult(){
        int m[]=new int[a.length+b.length];
        int k=0;
        System.out.println("first array");
        for(int i=0;i<a.length;i++ ){
            System.out.print(a[i]+"\t");
            m[k]=a[i];
            k++;
        }
        System.out.println("\nsecond array");
        for(int i=0;i<b.length;i++ ){
            System.out.print(b[i]+"\t");
            m[k]=b[i];
            k++;
        }

        System.out.println("\nMerged array");
        for(int i=0;i<m.length;i++ ) System.out.print(m[i]+"\t");
    }
}
public class ArrayApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first array size");
        int a[]=new int[sc.nextInt()];
        System.out.println("enter elements in first array");
       for(int i=0;i<a.length;i++)a[i]=sc.nextInt();


        System.out.println("enter second array size");
        int b[]=new int[sc.nextInt()];
        System.out.println("enter elements in second array");
        for(int i=0;i<b.length;i++)b[i]=sc.nextInt();

        Unique u=new Unique();
        u.setArray(a,b);
        u.getResult1();

//        u.setArray(a);
//        u.getResult1();

        System.out.println("\nenter first array size");
         a=new int[sc.nextInt()];
        System.out.println("enter elements in first array");
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();


        System.out.println("enter second array size");
         b=new int[sc.nextInt()];
        System.out.println("enter elements in second array");
        for(int i=0;i<b.length;i++)b[i]=sc.nextInt();

        MergeArray m=new MergeArray();
        m.setArray(a,b);
        m.getResult();


    }
}
