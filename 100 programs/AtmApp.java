import java.util.*;
public class AtmApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter balance in account");
		int balance=sc.nextInt();
		System.out.println("Enter widrall amount ");
		int widrall=sc.nextInt();
		if(widrall%5==0 && balance>widrall)
		{
			float charge=0.50f;
			float balaceamount=balance-(widrall+charge);
			System.out.println("remaining balence in account is -->"+balaceamount);
		}
		else if(balance<widrall)
			System.out.println("account balance is not sufficient for widrall");
		else
			System.out.println("widrall is not multiple of five");
	}
}