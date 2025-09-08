import java.util.Scanner;
/*Q2. Merge Sorted Array
Problem: Given two sorted integer arrays A and B, merge B into A as one sorted array.
Note: You may assume that A has enough space to hold additional elements from B.
 The number of elements initialized in A and B are m and n respectively.

Your Task
__________________________________________________________
You have to create class name as MergeSorted Array with parameterized constructor
MergeSorted(int a[],int b[]): this constructor can accept the two array as parameter
void merge(): this function can write the merging logics
int [] getMergedArray(): this function can merge and return the resultant array.
*/
class MeargeSorted
{
    private int a[];
    private int b[];
    private int c[];
    MeargeSorted(int a[],int b[])
    {
        this.a=a;
        this.b=b;
    }
    public void mearge()
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

        System.out.println();
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+"\t");
        System.out.println();
        c=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            c[k]=a[i];
            k++;
        }
        for(int i=0;i<b.length;i++)
        {
            c[k]=b[i];
            k++;
        }
    }
    public int [] getMerge()
    {
        return c;
    }
}
public class Mearge_31_3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};

        MeargeSorted ms=new MeargeSorted(a,b);
        ms.mearge();
        int c[]= ms.getMerge();
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+"\t");


    }
}
