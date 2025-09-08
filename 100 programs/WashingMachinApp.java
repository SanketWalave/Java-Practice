import java.util.*;
public class WashingMachinApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weight of cloths in gram");
		int weight=sc.nextInt();
		if(weight<2000 && weight>1)
			System.out.println("25 minuts");
		if(weight>2001 && weight<4000)
			System.out.println("35 minuts");
		if(weight>4000)
			System.out.println("45 minuts");
		if(weight>7000)
			System.out.println("OVERLODED");
		
		
	}
}