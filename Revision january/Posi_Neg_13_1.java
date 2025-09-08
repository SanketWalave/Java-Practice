/*3. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/
import java.util.*;
class NumberChecker
{
	void isEven(int num)
	{
		if(num%2==0)
			System.out.println("Number is even");
		else if(num%2==1)
			System.out.println("Number is odd");
		else
			System.out.println("Number is 0");
	}
}
public class Posi_Neg_13_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		
		int ch=0;
		do{
			System.out.println("enter number");
			int num=sc.nextInt();
			NumberChecker nc=new NumberChecker();
			nc.isEven(num);
			
			System.out.println("enter 1 if you want to stop");
			 ch=sc.nextInt();
		}while(ch!=1);
	}
}