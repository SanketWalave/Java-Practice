import java.util.*;
public class SimpleIntrestApp
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
		int simpleintrest=(priamo*time*rate)/100;
		System.out.println(simpleintrest);
	}
}