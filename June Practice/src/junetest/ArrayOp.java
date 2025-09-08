package junetest;

import java.util.*;
/*
Q3. Create class name as ArrayOperation with method name as setArray()  and create its Two child.
Classes name as BiggerValue, SmallestMissing. We need to inherit the ArrayOperation class in
BiggerValue,  SmallestMissing and create function and write the logic.

 1. BiggerValue Class : -
  To print next greater elements in a given unsorted array. Elements for
  which no greater element exist, consider next greater element as -1.
  Expected Output :
  The given array is : 5 3 10 9 6 13
  Next Bigger Elements are:
  Next bigger element of 5 in the array is: 10
  Next bigger element of 3 in the array is: 10
  Next bigger element of 10 in the array is: 13
  Next bigger element of 9 in the array is: 13
  Next bigger element of 6 in the array is: 13
  Next bigger element of 13 in the array is: -1
  Next Bigger Elements Array:
  10 10 13 13 13 -1

2. SmallestMissing class :-

 Input :
The given array is : 0 1 3 4 5 6 7 9
Output :
The missing smallest element is: 2 */
class ArrayOperation{
    protected int []a;
    public void setArray(int []a){
        this.a=a;
    }
}
class BiggerValue extends  ArrayOperation{
    public void getBigValues(){
        int[] nge = new int[a.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            // Pop smaller elements from the stack
            while (!stack.isEmpty() && stack.peek() <= a[i]) {
                stack.pop();
                System.out.println(stack);
            }
            // If stack is empty, no greater element exists
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            System.out.println(Arrays.toString(nge));
            // Push current element onto the stack
            stack.push(a[i]);
            System.out.println(stack);

        }

        // Print the results
        for (int i = 0; i < a.length; i++) {
            if (nge[i] != -1) {
                System.out.println("Next bigger element of " + a[i] + " in the array is: " + nge[i]);
            } else {
                System.out.println("No bigger element to the right of " + a[i]);
            }
        }
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[j]>a[i])
//                {
//                    System.out.println("Next bigger element of "+ a[i]+" in the array is: "+a[j]);
//                    if(a[i+1]<a[i]){
//                        System.out.println("Next bigger element of "+ a[i+1]+" in the array is: "+a[j]);
//                        i++;
//                        break;
//                    }else  break;
//                }
//            }
//        }
    }
}
class SmallestMissing extends ArrayOperation{
    public int smallMiss(){
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]>1){
                return a[i]+1;
            }
        }
        return 0;
    }
}
public class ArrayOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={5,3,10,9,6,13};
        BiggerValue b=new BiggerValue();
        b.setArray(a);
        b.getBigValues();
//        SmallestMissing sm=new SmallestMissing();
//        sm.setArray(new int[0,1,3,4,5]);
//        sm.setArray(new int[]{0,1,3,4,5});
//        System.out.println(sm.smallMiss());
    }
}
