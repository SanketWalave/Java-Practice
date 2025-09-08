import java.util.*;
public class Library
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter days of returning book");
		int days=sc.nextInt();
		int result=
		days<5?days*1:
		days<10?days*2:
		days<30?days*5:days*10;
		System.out.println(result);
		String result1=
		result<155?"card not canseld":"card get canseld";
		System.out.println(result1);
		
		//"card canseld";
	
	/*
      if(days<5)
     {
	   int charge=days*1;
	   System.out.println(charge);
     }	
	else if(days<10)
	 {
		 int charge=days*2;
		 System.out.println(charge);
	 }
	 else if(days<30)
	 {
		 int charge=days*5;
		 System.out.println(charge);
	 }
	 else
	 {
		 System.out.println("card will canseld");
	 }*/
	}
}