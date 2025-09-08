import java.util.*;
public class MorningEvining
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter time (1 to 24)");
		float time=sc.nextFloat();
		String result=
		time<12?"morning":"evining";
		System.out.println(result);
	}
}
