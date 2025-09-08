import java.util.*;
public class SwappUsingBit
{
	
    public static void main(String x[])
    {
	 // int a=5,b=4,c;
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	  
	System.out.println("Before Swapping");
	System.out.println(a);
	System.out.println(b);
	/*System.out.printf("Before Swapping\n");
	System.out.printf("A=%d\tB=%d\n",a,b);
    */

	a=a^b;

	b=a^b;

	a=a^b;

	System.out.println("After Swapping");
	System.out.println(a);
	System.out.println(b);
    /*System.out.printf("After Swapping\n");
	System.out.printf("A=%d\tB=%d\n",a,b);
    */
    }

}