import java.util.*;
public class Lcm
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int num1,num2,i=1,hcf=0;
		num1=sc.nextInt();
		num2=sc.nextInt();
		while(i<=num1 && i<=num2)
		{
			if(num1%i==0 && num2%i==0)
			{
			    System.out.println("hcf "+i);
			}
			i++;
		//	System.out.println(i);
		}
	}
}