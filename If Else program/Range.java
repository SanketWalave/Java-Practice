import java.util.*;
public class Range
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int startnum=sc.nextInt();
		int endnum=sc.nextInt();
		System.out.println("Enter num");
		int num=sc.nextInt();
		String result=
		(startnum<num && endnum>num)?"number is in range":"numberis not in range";
		System.out.println(result);
	}
}