/*Q2. Problem: Create an abstract class Bank with the following methods:
• deposit(double amount) — allows depositing an amount.
• withdraw(double amount) — allows withdrawing an amount.
getBalance() — returns the current balance.
Then, create two subclasses:
• SavingsBank — charges a fixed fee of $2 per transaction.
• CurrentBank — charges a fixed fee of $5 per transaction.
Write a program that deposits and withdraws money from both types of banks and 
displays the balance after each transaction.
Explanation:
• The abstract class Bank defines the common structure for the deposit, withdraw, and 
balance methods.
• Each subclass applies a different transaction fee.
• Logical operation: Use method overriding to show different transaction fees for each 
type of bank.*/

import java.util.*;
abstract class Bank 
{
	abstract void diposit(int diposit);
	abstract void withdraw(int withdraw);
	abstract int getBalance();
}
class SavingsBank extends Bank
{
	protected int diposit;
	protected int withdraw;
	protected int balance;
	SavingsBank(int balance)
	{
		this.balance=balance;
	}
	public void diposit(int diposit)
	{
		System.out.println("Balance before transaction \t= "+balance);
		this.diposit=diposit;
		balance+=diposit-2;
	}
	public void withdraw(int withdraw)
	{
		System.out.println("Balance before transaction \t= "+balance);
		this.withdraw=withdraw;
		if(withdraw>=balance)
		{
			System.out.println("low bank balance we cant perform transaction");

		}
		else  
		{balance=(balance-withdraw)-2;}
		
	}
	public int getBalance()
	{
		

		return balance;
	}
}
class CurrentBank extends Bank
{
	protected int diposit;
	protected int withdraw;
	protected int balance;
	CurrentBank(int balance)
	{
		this.balance=balance;
	}
	public void diposit(int diposit)
	{
		System.out.println("Balance before transaction \t= "+balance);
		this.diposit=diposit;
		balance+=diposit-5;
	}
	public void withdraw(int withdraw)
	{
		System.out.println("Balance before transaction \t= "+balance);
		this.withdraw=withdraw;
		if(withdraw>=balance)
		{
			System.out.println("low bank balance we cant perform transaction");

		}
		else  
		{balance=(balance-withdraw)-5;}
		
	}
	public int getBalance()
	{
		

		return balance;
	}
}
public class BankAccount_28_1
{
	public static void main(String x[])
	{



		Scanner sc=new Scanner(System.in);
		int diposit,withdraw;
		System.out.println("enter SavingsBank balance");
		int balance=sc.nextInt();
		SavingsBank sb=new SavingsBank(balance);
		System.out.println("Enter what you want to do in SavingsBank account");
		System.out.println("1: diposit");
		System.out.println("2: withdraw");
		int choice1=sc.nextInt();
		switch(choice1)
		{
		case 1:
			System.out.println("Enter diposit ammount");
			 diposit=sc.nextInt();
			 sb.diposit(diposit);
			 System.out.println("balance afte diposit\t= "+sb.getBalance());
		break;

		case 2:
			System.out.println("Enter withdraw ammount");
			withdraw=sc.nextInt();
			 sb.withdraw(withdraw);
			 System.out.println("balance afte withdraw\t= "+sb.getBalance());
		break;

	default:
		System.out.println("Envalid choice");
		break;
		}

		System.out.println("enter CurrentBank balance");
		int balance2=sc.nextInt();
		CurrentBank cb=new CurrentBank(balance2);
		System.out.println("Enter what you want to do in CurrentBank account");
		System.out.println("1: diposit");
		System.out.println("2: withdraw");
		int choice2=sc.nextInt();
		switch(choice2)
		{
		case 1:
			System.out.println("Enter diposit ammount");
			 diposit=sc.nextInt();
			cb.diposit(diposit);
			 System.out.println("balance afte diposit\t= "+cb.getBalance());
		break;

		case 2:
			System.out.println("Enter withdraw ammount");
			withdraw=sc.nextInt();
			 cb.withdraw(withdraw);
			 System.out.println("balance afte withdraw\t= "+cb.getBalance());
		break;

	default:
		System.out.println("Envalid choice");
		break;
		}
	}
}