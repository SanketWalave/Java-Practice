import java.util.*;

public class StrongNumberApp
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		checkStrongApp(num);
	}
		public static void checkStrongApp(int num)
		{
			int fact = 1;
			int sum = 0;
			for(int i = 1;i <= num ;i++) 
			{
				fact =  fact * i;
				sum = sum + fact;
			}
			
			System.out.println(fact);
			System.out.println(sum);
			if (sum == num)
			{
				System.out.println(" Number is strong Number");
			}
			else
			{
				System.out.println(" Number is not strong Number");
			}
		}
}