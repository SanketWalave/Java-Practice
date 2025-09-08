/*1. Create a BankAccount class
Create a BankAccount class with fields accountNumber and balance.
The default constructor should assign a fixed account number and balance.
Add a method deposit() that increases the balance by a fixed amount, e.g., 100.
Explanation: This teaches object initialization and the concept of modifying 
instance variables through methods.
*/
import java.util.*;
class BankAccount
{
	private String accountNumber;
	private int balance;
	BankAccount(String accountNumber,int balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	void diposit()
	{
		System.out.println("Account holder id\t"+accountNumber);
		System.out.println("Account balance  \t"+balance);
		System.out.println("Accoun balance after deposit");
		balance+=100;
		System.out.println("Account balance  \t"+balance);

	}
}
public class BankAccount_17_1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number");
		String accountNumber=sc.next();
		System.out.println("Enter balance");
		int balance=sc.nextInt();

		BankAccount b=new BankAccount(accountNumber,balance);
		b.diposit();
	}
}