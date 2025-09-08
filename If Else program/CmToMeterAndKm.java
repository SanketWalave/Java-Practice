import java.util.*;
public class CmToMeterAndKm
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length in cm");
		int cm,m,km;
		cm=sc.nextInt();
		if(cm>=100)                                    //remaining//
		{
			m=cm/100;
		//	cm=(cm*100)%100;
			System.out.println(" cm in meter is   "+m);
			int remaincm=(cm%100);
		//	System.out.println("Remaining cm are  "+remaincm);
			if(m>=1000)
		{
			km=m/1000;
		//	cm=(cm*100)%100;
		//System.out.println(" cm in  kilo meter is   "+km+"."+remainmeters+"."+remaincm);
			System.out.println(" cm in  kilo meter is   "+km);
			int remainmeters=(m%1000);
			System.out.println("Remainin meters are  "+remainmeters);
			System.out.println("Remaining cm are  "+remaincm);
			System.out.println(" cm in  kilo meter is   "+km+"."+remainmeters+"."+remaincm);
		}
		
		}
		
	}
}