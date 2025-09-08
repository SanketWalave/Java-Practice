import java.util.*;
public class ElectricityBillApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of units consumed");
		int units=sc.nextInt();
		float bill;
		if(units<=50)
		{
			bill=units*0.50f;
			System.out.println("bill is -->"+bill);
			float persent=bill*20/100;
		System.out.println("20 persent of bill is---->"+persent);
		float finalbill=bill+persent;
		System.out.println("final bill is ---->"+finalbill);
		}
				if(units<=100)
		{
			bill=units*0.70f;
			System.out.println("bill is -->"+bill);
             float persent=bill*20/100;
		System.out.println("20 persent of bill is---->"+persent);
		float finalbill=bill+persent;
		System.out.println("final bill is ---->"+finalbill);
		}
				if(units<=250)
		{
			bill=units*1.20f;
			System.out.println("bill is -->"+bill);
			float persent=bill*20/100;
		System.out.println("20 persent of bill is---->"+persent);
		float finalbill=bill+persent;
		System.out.println("final bill is ---->"+finalbill);
		}
				if(units>250)
		{
			bill=units*1.50f;
			System.out.println("bill is -->"+bill);
			float persent=bill*20/100;
		System.out.println("20 persent of bill is---->"+persent);
		float finalbill=bill+persent;
		System.out.println("final bill is ---->"+finalbill);
		}
		
	}
}