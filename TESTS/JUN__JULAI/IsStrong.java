/*Q2. Write a java program to check whether number is strong or notstrong using function 
recursion.*/
import java.util.*;
public class IsStrong
{
	static int sum=0;
	public static void main(String x[])
	{
		Scanner sc=new  Scanner (System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		boolean res=isStrong(num);

		if(res)
		{
			System.out.println("Number is strong");
		}
		else  
		{
			System.out.println("Number is not strong");
		}
	}
	public static boolean isStrong(int num)
	{
		int temp=num;
		System.out.println("temp\t"+temp);
		if(num!=0)
		{
			int rem=num%10,power=1;
			for(int i=1;i<=rem;i++)
			{
				power*=i;

			}
			sum+=power;
			System.out.println("sum\t"+sum);
			num/=10;
			System.out.println("num\t"+num);
			
		isStrong(num);
		}
		
		
		return temp==sum;
		
	}
}