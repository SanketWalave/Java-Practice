import java.util.*;
class Interest
{
	
	int pamount,rate,time;
	void setValus(int pamount,int rate,int time)
	{
		this.pamount=pamount;
		this.rate=rate;
		this.time=time;
	}
}
class CalculateInterest extends Interest
{
	void callintrest()
	{
		int si=(pamount*rate*time)/100;
		System.out.println("simple intrest\t"+(pamount+si));
	}
}
public class Interest_Inh
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter principle amount");
		int pamount=sc.nextInt();
		System.out.println("Enter intret rate ");
		int rate=sc.nextInt();
		System.out.println("Enter time period");
		int time=sc.nextInt();
		
		CalculateInterest c=new CalculateInterest();
		c.setValus(pamount,rate,time);
		c.callintrest();
	}
}