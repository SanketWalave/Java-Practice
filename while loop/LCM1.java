import java.util.*;
public class LCM1
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcm = 1;
		int i = 1;
		while( i >= num1 && i >= num2)
		{
			if(i % num1 == 0 && i % num2 == 0)
			{
				lcm = i;

			}
			i++;
		System.out.println("The HCF of " + num1 +" and " + num2 + " is: " +lcm);

		}

	}
}
