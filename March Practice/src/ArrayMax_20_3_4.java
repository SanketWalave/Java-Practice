import java.util.Scanner;
/*Q4. Create a class Biggest that contains a single-dimensional array as a data member and a method display() to
 find and display the largest element of the array.*/
class Bigest
{
    private int a[];
    public void setArray(int ...a)
    {
        this.a=a;
    }
    public void display()
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("max is "+max);
    }
}
public class ArrayMax_20_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        Bigest b=new Bigest();
        b.setArray(a);
        b.display();
    }
}
