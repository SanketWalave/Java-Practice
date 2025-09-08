/*9. Simple Bank Account Menu
Description: Simulate a simple bank account with options to deposit, withdraw, check balance, and exit using a menu system.
 Use switch to manage the user's input and perform the corresponding operation.
Concepts Covered: switch, user input handling, basic financial operations*/
import java.util.*;
public class Bank_10_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bank balance");
		int balance,withdraw,deposit;
		balance=sc.nextInt();
		System.out.println("Enter your choice");
		System.out.println("1:deposit");
		System.out.println("2:withdraw");
		System.out.println("3:check balance");
		System.out.println("4:exit");
		 
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("Enter diposit amount");
			deposit=sc.nextInt();
			System.out.println("Balance after diposit  "+(deposit+balance));
			break;
			case 2:
			System.out.println("Enter withdraw amount");
			withdraw=sc.nextInt();
			if(withdraw>=balance)
				System.out.println("insufficient balance");
			else
				balance-=withdraw;
			
			System.out.println("Balance after withdraw  "+balance);
			break;
			case 3:
			System.out.println("Balance   "+balance);
			break;
			default :
			   break;
		}
	}
}