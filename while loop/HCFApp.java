import java.util.*;
public class HCfApp
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int HCF = 0;
		int i = 1;
		while( i <= num1 && i <= num2)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				HCF = i;
			}
		}
		i--;
		System.out.println("The HCF of " + num1 +" and " + num2 + " is: " +HCF);
	}
}