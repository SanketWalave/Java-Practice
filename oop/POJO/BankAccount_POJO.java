/*Question 2: Encapsulation and Validation

Create a POJO class named Account with the following fields:

    String accountNumber
    String accountHolderName
    double balance

Write a program to:

    Ensure the balance is not negative when setting the value (use a condition in the setter method).
    Write methods to deposit and withdraw money. Ensure withdrawal does not lead to a negative balance.
    Test the Account class by performing deposit and withdrawal operations.
*/
import java.util.*;
class Acount
{
	private String acountnum,acnholName;
	private double acbalance;
	public void setAcNo(String acno)
	{
		acountnum=acno;
	}
	public String getAcNo()
	{
		return acountnum;
	}
	public void setAcHoName(String achname)
	{
		acnholName=achname;
	}
	public String getAcHoName()
	{
		return acnholName;
	}
	void setAcBalance(double acbal)
	{
		if(acbal>0)
		{
			acbalance=acbal;
		}
	}
	double getAcbalance()
	{
		return acbalance;
	}
	void diposit(int di)
	{
		acbalance+=di;
		System.out.println("Account balance after diposit \t"+acbalance);
	}
	void withdrawal(double wid)
	{
		if(wid<=acbalance)
		{
			double rebal=acbalance-wid;
			System.out.println("Balance remaining after widrall \t"+rebal);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
}	
public class BankAccount_POJO
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number");
		String acn=sc.nextLine();
		System.out.println("Enter account Holder Name");
		String achname=sc.nextLine();
		System.out.println("Enter balance");
		double acbal=sc.nextDouble();
		
		Acount ac=new Acount();
		ac.setAcNo(acn);
		String acountNm=ac.getAcNo();
		ac.setAcHoName(achname);
		String acountHoname=ac.getAcHoName();
		ac.setAcBalance(acbal);
		double acBalance=ac.getAcbalance();
		System.out.println("Acount number \t"+acountNm);
		System.out.println("Acount holder name\t"+acountHoname);
		System.out.println("acount balance \t"+acBalance);
		
		System.out.println("Enter diposit amount");
		int di=sc.nextInt();
		ac.diposit(di);
		System.out.println("Enter withdraw amount");
		double wid=sc.nextDouble();
		ac.withdrawal(wid);
		
		
		
	}
}
