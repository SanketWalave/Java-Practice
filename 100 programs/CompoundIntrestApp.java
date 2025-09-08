import java.util.*;
public class CompoundIntrestApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("inter principle amount");
		int priamo=sc.nextInt();
		System.out.println("enter period of time");
		int time=sc.nextInt();
		System.out.println("enter rate of intrest");
		int rate=sc.nextInt();
		int compoundintrest=priamo*(1+(rate/100))*time;
		System.out.println(compoundintrest);
	}
}