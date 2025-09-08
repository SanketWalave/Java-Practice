/*Q1. Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Your Task: You have to create class name as RotateArray with parameterized constructor

RotateArray(int a[]): this constructor can accept array as parmaeter
void rotateArray(): this function can rotate array from right hand side to left hand side.
Int [] getResult(): this function can return the resultant array means after rotation of array

*/

import java.util.*;
class RotateArray
{
    private int a[];
    private int k;
    RotateArray(int a[],int k)
    {
        this.a=a;
        this.k=k;
    }
    void rotateArray()
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
        System.out.println();
        for(int i=0;i<k;i++)
        {
            int temp=a[a.length-1];
            for(int j=a.length-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
    }
    int [] returnarray()
    {
        return a;
    }
}

public class Rotate_31_3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int a[]=new int [size];
        System.out.println("enter element in array");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("enter rotation");
        int k= sc.nextInt();
        RotateArray r=new RotateArray(a,k);
        r.rotateArray();
        int ans[]=r.returnarray();
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+"\t");

    }
}
