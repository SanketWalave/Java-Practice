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
import java.util.*;
class MeargeSort
{
    private int a[];
    private int b[];
    private int c[];
    public MeargeSort(int a[],int b[])
    {
        this.a=a;
        this.b=b;
    }
    public void mearge()
    {
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
    public int [] getMergedArray()
    {
        return c;
    }
}
public class Mearge
{
    public static void main(String[] args) {
            int a[]={1,2,3,4,5};
            int b[]={6,7,8,9,10,11};

            MeargeSort ms=new MeargeSort(a,b);
            ms.mearge();
            int c[]=ms.getMergedArray();
            for(int i=0;i<c.length;i++)
            {
                System.out.print(c[i]+" ");
            }
    }
}
