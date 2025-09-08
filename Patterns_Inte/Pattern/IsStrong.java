/*Q2. Write a java program to check whether number is strong or notstrong using function 
recursion.*/
import java.util.*;
public class IsStrong
{
	public static void main(String x[])
	{
		Scanne sc-new  Scanner (System.in);

		int num=sc.nextInt();
		isStrong(num);
	}
	public static void isStrong(int num)
	{
		int temp=num,sum=0;
		if(num>0)
		{
			int rem=num%10,power=1;
			for(int i=1;i<=rem;i++)
			{
				power*=i;
			}
			sum+=power;

			isStrong(num/=10)
		}
		if(temp==sum)
		{
			System.out.println("Number is strong");
		}
		else  
			System.out.println("Number is not strong");
	}
}