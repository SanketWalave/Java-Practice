import java.util.*;

public class Switchcase1
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Caculate Addition");
		System.out.println("2.Caculate Substraction");
		System.out.println("3.Caculate Division");
		System.out.println("4.Caculate Multiplication");
		System.out.println("5.Caculate Modulas");
		
		System.out.println("Enter Your Choice");
		String choice = sc.nextLine();

		System.out.println("Enter Two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		switch(choice)
		{
			case "1":
				int sum = num1+num2;
				System.out.println("sum:- " + sum);
				break;
				
			case "2":
				int sub = num1 - num2;
				System.out.println("sum" + sub);
				break;
				
			case "3":
				int mul = num1 / num2;
				System.out.println("sum" + mul);
				break;
				
			case "4":
				int div = num1 * num2;
				System.out.println("sum" + div);
				break;	
				
			case "5":
				int Mod = num1 % num2;
				System.out.println("sum" + Mod);
				break;
				
			default:
				System.out.println("invalid choice");
		}
	}
}		

