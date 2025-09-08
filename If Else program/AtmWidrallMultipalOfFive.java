/*Problem
Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
Input
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
Output
Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.
*/
import java.util.*;
public class AtmWidrallMultipalOfFive
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter widrall amount");
	float widammount=sc.nextFloat();
	System.out.println("enter bank balance");
	float bankball=sc.nextInt();
	//String result=
	float widrallcharge;
	widrallcharge=00.50f;
	
	float remain = bankball - widammount;
    float remainbankbalance = remain - widrallcharge;

/*	if(widammount%5==0)
	{
		float remain=bankball-widammount;
		float remainbankbalance=remain-widrallcharge;
		System.out.println("remaining bank balance is "+ remain);
		System.out.println("remaining bank balance after widrall charges  "+remainbankbalance);
	}
	else
	{
		System.out.println("widrall ammount is not multiple of five");
	}*/
	 String result = widammount % 5 == 0 ? 
               ("Remaining bank balance is " + remain + "\n" + "Remaining bank balance after withdrawal charge " + remainbankbalance) 
               : "Withdrawal amount is not a multiple of five";
System.out.println(result);
	}
} 

 
