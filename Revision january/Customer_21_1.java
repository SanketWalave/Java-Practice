/*4. Customer Abstract Class
Problem: Create an abstract class Customer with the following methods:
·        addTransaction(double amount) — adds a transaction amount.
·        getBalance() — returns the current balance.
Then, create two subclasses:
·        PremiumCustomer — offers a 10% discount on all transactions.
·        RegularCustomer — no discount on transactions.
Write a program that adds transactions for both types of customers and shows their final balance after
 applying the discount.
Explanation:
·        The abstract class Customer provides methods for adding transactions and checking balances.
·        Each subclass implements the transaction logic differently by applying a discount.
·        Logical operation: Method overriding to apply discounts and track customer balances.

*/
abstract class Customer
{
	protected double amount;
	 void addTransaction(double amount)
	 {
		 this.amount=amount;
	 }
	 abstract double getBalance();
}
class PremiumCustomer extends Customer
{
	double getBalance()
	{
		double discount=amount*0.10;
		
		return amount-discount;
	}
}
class RegularCustomer extends Customer
{
	double getBalance()
	{
		
		
		return amount;
	}
}
public class Customer_21_1
{
	public static void main(String x[])
	{
		PremiumCustomer pc=new PremiumCustomer();
		pc.addTransaction(100);
		System.out.println("Balance of primium customer\t"+pc.getBalance());
		
		RegularCustomer rc=new RegularCustomer();
		rc.addTransaction(100);
		System.out.println("Balance of regular customer\t"+rc.getBalance());
	}
}