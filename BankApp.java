import java.util.Scanner;

class Account{
	private int balance;
	private String name;
	private String acNo;
	Account(){}
	Account(int balance, String acNo, String name){
		this.acNo=acNo;
		this.name=name;
		this.balance=balance;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		this.balance=balance;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getAcNo(){
		return acNo;
	}
}
class BankOperations{
	private Account a;
	BankOperations(Account a){
		this.a=a;
	}
	
	public void deposit(int amount){
		a.setBalance(a.getBalance()+amount);
	}
	public void showDetails(){
		System.out.println("Name: " + a.getName());
		System.out.println("Account No: " + a.getAcNo());
		System.out.println("Balance: " + a.getBalance());
	}
}
class BankApp{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		String acno = in.nextLine();
		int balance = in.nextInt();
		Account a = new Account(balance, acno, name);
		
		new BankOperations(a).show();
	}
}