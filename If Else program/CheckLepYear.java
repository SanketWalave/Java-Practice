import java.util.*;
public class CheckLepYear
{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter year");
	int year=sc.nextInt();
	/*if ((year%4==0 && year%100==0)||(year%400==0))
	{
		System.out.println("year is leep year");
	}
	else
	{
		System.out.println("year is not leep year");
	}*/
	
	String result=((year%4==0 && year%100!=0)||(year%400==0))? "year is leep  year" : "year is not  leep year" ;
	//String result=((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";
 System.out.println(result);

}
}