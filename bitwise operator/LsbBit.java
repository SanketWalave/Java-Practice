//program to check lsb
import java.util.*;
public class LsbBit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int xx=sc.nextInt();
	   int lsb=xx&1;                                                       //ithe veriable name vapraych ahe
	   String binary = Integer.toBinaryString(xx);//Integer.toBinaryString(xx) is use for converting number to binary
       System.out.println(binary);
	  // String result=lsb==0?"lsb is 0":"lsb is 1";
	   //System.out.println(result);
	   if (lsb==0)
	   {
		   System.out.println("lsb is 0");
	   }
	   else
	   {
		   System.out.println("lsb is 1");
	   }
	}
}