import java.util.*;
public class Sec
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter seconds");
		int sec=sc.nextInt();
		if(sec>3600)
		{
			int hour=sec/3600;
			System.out.println("hour\t"+hour);
			sec=sec%3600;
		}
		
		 if(sec>60)
		{
			int minute=sec/60;
			System.out.println("minute\t"+minute);
			sec=sec%60;
		}
		 if(sec<60)
		{
			System.out.println("seconds\t"+sec);
		}
	}
}