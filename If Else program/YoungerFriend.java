import java.util.*;
public class YoungerFriend
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age of ajay ");
		int ajay=sc.nextInt();
		System.out.println("enter age of sanjay");
		int sanjay=sc.nextInt();
		System.out.println("enter age of shubham");
		int shubham=sc.nextInt();
		//String result=(ajay<sanjay && ajay<shubham)?"ajay is yonger":
		//(sanjay<ajay &&sanjay<shubham)?"sanjay is yonger":
		//(shubham<ajay && shubham<sanjay)?"shubham is yonger":"same age group";
		//System.out.println(result);
		if(ajay<sanjay && ajay<shubham)
		{
			System.out.println("ajay is yonger");
		}
		if(sanjay<ajay &&sanjay<shubham)
		{
			System.out.println("sanjay is yonger");
		}
		if(shubham<ajay && shubham<sanjay)
		{
			System.out.println("Shubham is yonger");
		}
		
	}
}